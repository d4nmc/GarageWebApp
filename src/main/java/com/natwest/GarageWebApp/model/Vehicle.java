package com.natwest.GarageWebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
		
	@Id
	@GeneratedValue
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
}
