package com.natwest.GarageWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natwest.GarageWebApp.database.GarageDatabase;
import com.natwest.GarageWebApp.model.Vehicle;

@Service
public class GarageService {

	private GarageDatabase database;
	
	@Autowired
	
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
		Vehicle existing = this.database.getById(id);
		existing.setBrand(vehicle.getBrand());
		existing.setModel(vehicle.getModel());
		existing.setColour(vehicle.getColour());
		existing.setBhp(vehicle.getBhp());
		existing.setEngineStyle(vehicle.getEngineStyle());
		existing.setRegPlate(vehicle.getRegPlate());
		existing.setFuel_type(vehicle.getFuel_type());
		existing.setModified(vehicle.isModified());

		Vehicle updated = this.database.save(existing);
		return updated;
	}

	public boolean deleteVehicle(Long id) {
	
		this.database.deleteById(id);
		return this.database.existsById(id);
	}

}
