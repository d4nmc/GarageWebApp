package com.natwest.GarageWebApp.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.GarageWebApp.model.Vehicle;

@Repository
public interface GarageDatabase  extends JpaRepository<Vehicle, Long>{

	
}
	