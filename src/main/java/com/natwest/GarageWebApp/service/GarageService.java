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
		
		Vehicle saveVehicle;
		
		Vehicle upVehicle = this.database.getById(id);

		// Set updated fields
		upVehicle.setBrand(vehicle.getBrand());
		upVehicle.setModel(vehicle.getModel());
		upVehicle.setColour(vehicle.getColour());
		upVehicle.setBhp(vehicle.getBhp());
		upVehicle.setEngineStyle(vehicle.getEngineStyle());
		upVehicle.setRegPlate(vehicle.getRegPlate());
		upVehicle.setFuel_type(vehicle.getFuel_type());
		upVehicle.setModified(vehicle.isModified());

		//Save changes to the database
		saveVehicle = this.database.save(upVehicle);
		return saveVehicle;
	}

	public void deleteVehicle(Long id) {
	
		this.database.deleteById(id);
	}

}
