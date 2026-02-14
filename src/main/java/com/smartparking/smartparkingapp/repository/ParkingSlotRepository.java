package com.smartparking.smartparkingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartparking.smartparkingapp.model.ParkingSlot;

public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Long> {

    List<ParkingSlot> findByOccupiedFalse();  // available slots
}
