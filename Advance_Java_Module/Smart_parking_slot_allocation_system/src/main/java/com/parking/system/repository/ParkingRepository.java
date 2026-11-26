package com.parking.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.system.entity.Slot;

public interface ParkingRepository extends JpaRepository<Slot, Long>{

}
