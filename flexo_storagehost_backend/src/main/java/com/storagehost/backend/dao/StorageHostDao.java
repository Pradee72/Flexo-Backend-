package com.storagehost.backend.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StorageHostDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ownerName;

    private String unitName;

    private String address;

    private String city;

    private double latitude;

    private double longitude;

    private int capacity; // total capacity

    private int availableSlots; // current availability

    private String contactNumber;

    private boolean isActive = true;

    private double pricePerKg;

}
