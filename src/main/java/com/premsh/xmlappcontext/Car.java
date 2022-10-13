package com.premsh.xmlappcontext;

import com.premsh.xmlappcontext.parts.Alternator;
import com.premsh.xmlappcontext.parts.Battery;
import com.premsh.xmlappcontext.parts.Brakes;
import com.premsh.xmlappcontext.parts.Engine;
import com.premsh.xmlappcontext.parts.Radiator;
import com.premsh.xmlappcontext.parts.Suspension;
import com.premsh.xmlappcontext.parts.Transmission;

public class Car {
	
	private int id;
	private String model;
	private String brand;
	private Alternator alternator;
	private Battery battery;
	private Brakes brakes;
	private Engine engine;
	private Radiator radiator;
	private Suspension suspension;
	private Transmission transmission;
	
	public Alternator getAlternator() {
		return alternator;
	}

	public void setAlternator(Alternator alternator) {
		this.alternator = alternator;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Brakes getBrakes() {
		return brakes;
	}

	public void setBrakes(Brakes brakes) {
		this.brakes = brakes;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Radiator getRadiator() {
		return radiator;
	}

	public void setRadiator(Radiator radiator) {
		this.radiator = radiator;
	}

	public Suspension getSuspension() {
		return suspension;
	}

	public void setSuspension(Suspension suspension) {
		this.suspension = suspension;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}
	
	public Car(String model, String brand, IdGenerator generator) {
		this.model = model;
		this.brand = brand;
		this.id = generator.generate();
	}
	
	@Override
	public String toString() {
		return "Car id : %d || model : %s | brand : %s".formatted(id, model, brand);
	}
}
