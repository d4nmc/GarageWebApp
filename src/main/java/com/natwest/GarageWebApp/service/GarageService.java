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
		// TODO Auto-generated method stub
		return null;
	}

	public List<Vehicle> readAllVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Vehicle updateVehicle(Long id, Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteVehicle(Long id) {
		// TODO Auto-generated method stub
		
	}

}
