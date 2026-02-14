package com.smartparking.smartparkingapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smartparking.smartparkingapp.model.ParkingSlot;
import com.smartparking.smartparkingapp.service.ParkingService;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {

    private final ParkingService service;

    public ParkingController(ParkingService service) {
        this.service = service;
    }

    // Create parking slot
    @PostMapping("/slot")
    public ParkingSlot createSlot(@RequestParam String slotNumber) {
        return service.createSlot(slotNumber);
    }

    // Get all slots
    @GetMapping("/slots")
    public List<ParkingSlot> getAllSlots() {
        return service.getAllSlots();
    }

    // Get available slots
    @GetMapping("/available")
    public List<ParkingSlot> getAvailableSlots() {
        return service.getAvailableSlots();
    }

    // Park vehicle
    @PostMapping("/park")
    public ParkingSlot parkVehicle(@RequestParam Long slotId,
                                   @RequestParam String vehicleNumber) {
        return service.parkVehicle(slotId, vehicleNumber);
    }

    // Remove vehicle
    @PostMapping("/remove")
    public ParkingSlot removeVehicle(@RequestParam Long slotId) {
        return service.removeVehicle(slotId);
    }
}


