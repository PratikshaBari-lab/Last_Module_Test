package com.parking.system.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="parking")
public class Slot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long slot_id;
	@Column(name="parking_number")
	private String parking_number;
	@Enumerated(EnumType.STRING)
	@Column(name="vehicle_type", nullable = false)
	private VehicleType vehicle_type;
	@Enumerated(EnumType.STRING)
	@Column(name="parking_status", nullable = false)
	private ParkingStatus status;
	
	@Column(name="parking_by")
	private String parking_by;
	@Column(name="released_by")
	private String released_by;
	@CreationTimestamp
	@Column(name = "created_at", nullable = false, updatable = false)	
	private LocalDateTime parking_at;
	@UpdateTimestamp
	@Column(name = "updated_at", nullable = false, updatable = true)
	private LocalDateTime released_at;
	
}
