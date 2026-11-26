package com.parking.system.controller;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parking.system.repository.ParkingRepository;
import com.parking.system.service.VehicleSlotService;

@RestController
@RequestMapping(" /api/parking")
public class VehicleSlotController {

	@Autowired
	private ParkingRepository parkingRepository;
	
	@Autowired
	private VehicleSlotService slotService; 
	
}
