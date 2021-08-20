package com.natwest.GarageWebApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.natwest.GarageWebApp.database.GarageDatabase;
import com.natwest.GarageWebApp.model.Vehicle;

@Service
public class GarageService {

	private GarageDatabase database;
	
	public GarageService(GarageDatabase database) {
		super();
		this.database = database;
	}

	
	
	public Vehicle createVehicle(Vehicle vehicle) {
		
		return this.database.save(vehicle);
	}

	public List<Vehicle> readAllVehicle() {
		
		return this.database.findAll();
	}

	public Vehicle updateVehicle(Long id, Vehicle vehicle) {
		
		return null;
	}

	public void deleteVehicle(Long id) {
	
		this.database.deleteById(id);
	}

}
