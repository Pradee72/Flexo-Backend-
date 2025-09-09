package com.storagehost.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storagehost.backend.dao.StorageHostDao;

@Repository
public interface StorageHostRepository extends JpaRepository<StorageHostDao, Long> {
	
}
