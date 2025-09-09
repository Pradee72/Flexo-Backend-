package com.storagehost.backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storagehost.backend.dao.StorageHostDao;
import com.storagehost.backend.dto.NearBySearchDto;
import com.storagehost.backend.repository.StorageHostRepository;

@Service
public class StorageHostService {

	@Autowired
	private StorageHostRepository storageHostRepository;

	public List<StorageHostDao> getNearBy(NearBySearchDto nearBySearchDto) {
		List<StorageHostDao> allUnits = storageHostRepository.findAll();
		double userLat = nearBySearchDto.getLatitude();
		double userLng = nearBySearchDto.getLongitude();

		return allUnits.stream().filter(unit -> {
			double distance = calculateDistance(userLat, userLng, unit.getLatitude(), unit.getLongitude());
			return unit.isActive() && unit.getAvailableSlots() > 0 && distance <= 10.0;
		}).collect(Collectors.toList());
	}

	private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
		final int R = 6371; // Radius of the earth in km
		double dLat = Math.toRadians(lat2 - lat1);
		double dLon = Math.toRadians(lon2 - lon1);
		double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1))
				* Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		return R * c; // distance in km
	}

}
