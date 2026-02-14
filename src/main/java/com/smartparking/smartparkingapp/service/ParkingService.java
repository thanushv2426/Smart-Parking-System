package com.smartparking.smartparkingapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartparking.smartparkingapp.model.ParkingSlot;
import com.smartparking.smartparkingapp.repository.ParkingSlotRepository;

@Service
public class ParkingService {

    private final ParkingSlotRepository repository;

    public ParkingService(ParkingSlotRepository repository) {
        this.repository = repository;
    }

    public ParkingSlot createSlot(String slotNumber) {
        ParkingSlot slot = new ParkingSlot(slotNumber);
        return repository.save(slot);
    }

    public List<ParkingSlot> getAllSlots() {
        return repository.findAll();
    }

    public List<ParkingSlot> getAvailableSlots() {
        return repository.findByOccupiedFalse();
    }

    public ParkingSlot parkVehicle(Long slotId, String vehicleNumber) {
        ParkingSlot slot = repository.findById(slotId)
                .orElseThrow(() -> new RuntimeException("Slot not found"));

        if (slot.isOccupied()) {
            throw new RuntimeException("Slot already occupied");
        }

        slot.setOccupied(true);
        slot.setVehicleNumber(vehicleNumber);
        return repository.save(slot);
    }

    public ParkingSlot removeVehicle(Long slotId) {
        ParkingSlot slot = repository.findById(slotId)
                .orElseThrow(() -> new RuntimeException("Slot not found"));

        slot.setOccupied(false);
        slot.setVehicleNumber(null);
        return repository.save(slot);
    }
}
