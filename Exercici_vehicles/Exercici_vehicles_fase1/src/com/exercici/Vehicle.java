package com.exercici;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
	// respresenta que aquesta és una classe disenyada per encapsular dades. Per això només té mètodes de tipus instància,
	// però com que és abstract,  caldrà instanciar amb les seves subclasses.


	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();


	/*el següent mètode és un instace method, pq no té la paraula static. És el constructor, per tant, podem crear vehicles així:
	Vehicle vehicle1 = new Vehicle("DRW8986", "Ford", "Blue"); però com que és abstract, haurem de crear els vehicles instanciant
	a partir de les seves subclasses: Car i Bike.
	*/
	public Vehicle(String plate, String brand, String color) throws Exception {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

}
