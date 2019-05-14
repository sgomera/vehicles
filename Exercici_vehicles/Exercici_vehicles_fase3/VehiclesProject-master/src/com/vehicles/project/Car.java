package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception("hi ha d'haver dues rodes");

		if (!wheels.get(0).toString().equalsIgnoreCase(wheels.get(1).toString()))
			throw new Exception("Les rodes d'un mateix eix han d'ésser iguals");

		this.wheels.add(wheels.get(0));
		this.wheels.add(wheels.get(1));
	}

}
