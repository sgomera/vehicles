package com.exercici;

import java.util.List;

//car deu ser una subclasse de Vehicle té la funcionalitat i Car l'hereta i l'extén, igual que bike.
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

		//Modifico la comparació per fer servir el to string i no coparar els espais de memòria sinó els valors de diàmetre.
		/*Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception("Les rodes d'un mateix eix han d'ésser iguals");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);*/


		if (!wheels.get(0).toString().equalsIgnoreCase(wheels.get(1).toString()))
			throw new Exception("Les rodes d'un mateix eix han d'ésser iguals");

		this.wheels.add(wheels.get(0));
		this.wheels.add(wheels.get(1));
	}

}
