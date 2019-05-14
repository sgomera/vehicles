package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {

		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> wheels) throws Exception {
		addTwoWheels(wheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception("hi ha d'haver dues rodes");

		Wheel frontWheel = wheels.get(0);
		Wheel backWheel = wheels.get(1);

		if (!wheels.get(0).toString().equalsIgnoreCase(wheels.get(1).toString()))
			throw new Exception("les dues rodes han de tenir la mateixa mida");

		this.wheels.add(frontWheel);
		this.wheels.add(backWheel);
	}

}
