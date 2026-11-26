package com.parking.system.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.system.entity.Slot;
import com.parking.system.repository.ParkingRepository;

@Service
public class VehicleSlotServiceImplementation implements VehicleSlotService  {

	@Autowired
	private ParkingRepository repository;
	
	@Override
	public List<Slot> ViewVehicleSlotList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Slot ViewVehicleByVehicleNumber(Long VehicleNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Slot> ViewVehicleRecordByVehicleNumber(Long VehicleNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Long> ViewAvailableSlot(Date checkDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
