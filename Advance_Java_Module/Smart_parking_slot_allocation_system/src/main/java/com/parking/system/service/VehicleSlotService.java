package com.parking.system.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.parking.system.entity.Slot;

@Service
public interface VehicleSlotService {

	public List<Slot> ViewVehicleSlotList();
	
	public Slot ViewVehicleByVehicleNumber(Long VehicleNumber);
	
	public List<Slot> ViewVehicleRecordByVehicleNumber(Long VehicleNumber);
	
	public List<Long> ViewAvailableSlot(Date checkDate); 
	
}
