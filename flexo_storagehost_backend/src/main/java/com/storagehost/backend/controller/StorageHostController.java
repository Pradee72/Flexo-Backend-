package com.storagehost.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.storagehost.backend.dao.StorageHostDao;
import com.storagehost.backend.dto.NearBySearchDto;
import com.storagehost.backend.service.StorageHostService;
	
@RestController
public class StorageHostController {
	
	@Autowired
	private StorageHostService storageHostService;
	
    @GetMapping("/nearby")
    public List<StorageHostDao> getNearby(@RequestBody NearBySearchDto userLocation) {
    	return storageHostService.getNearBy(userLocation);
    }
	
}
