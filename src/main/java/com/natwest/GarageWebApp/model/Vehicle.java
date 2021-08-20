package com.natwest.GarageWebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vehicle_id;	
	
	private String 	registration_number;	
	private String 	brand;					
	private String 	model;					
	private	String	colour;					
	private int bhp;				
	private String	engineStyle;			
	private String	regPlate;		
	private	String	fuel_type;				
	private	boolean	modified;
	
	
	public Vehicle(Long vehicle_id, String registration_number, String brand, String model, String colour, int bhp,
			String engineStyle, String regPlate, String fuel_type, boolean modified) {
		
		super();
		this.vehicle_id = vehicle_id;
		this.registration_number = registration_number;
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.bhp = bhp;
		this.engineStyle = engineStyle;
		this.regPlate = regPlate;
		this.fuel_type = fuel_type;
		this.modified = modified;
		
		
	}

	public Vehicle(String registration_number, String brand, String model, String colour, int bhp, String engineStyle,
			String regPlate, String fuel_type, boolean modified) {
		super();
		this.registration_number = registration_number;
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.bhp = bhp;
		this.engineStyle = engineStyle;
		this.regPlate = regPlate;
		this.fuel_type = fuel_type;
		this.modified = modified;
	}

	public Long getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(Long vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getRegistration_number() {
		return registration_number;
	}

	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getBhp() {
		return bhp;
	}

	public void setBhp(int bhp) {
		this.bhp = bhp;
	}

	public String getEngineStyle() {
		return engineStyle;
	}

	public void setEngineStyle(String engineStyle) {
		this.engineStyle = engineStyle;
	}

	public String getRegPlate() {
		return regPlate;
	}

	public void setRegPlate(String regPlate) {
		this.regPlate = regPlate;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public boolean isModified() {
		return modified;
	}

	public void setModified(boolean modified) {
		this.modified = modified;
	}
	
	
	
}
