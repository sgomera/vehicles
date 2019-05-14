package com.exercici;

// Classe tipus model per encapsular dades de Wheel
public class Wheel {
	private String brand;
	private double diameter;

	//instance method Wheel
	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
		checkDiameter(diameter);
	}

	public void checkDiameter(double diameter) {
		if (diameter < 0.4 || diameter > 4) {
			throw new IllegalArgumentException("El diametre de les rodes ha d'estar entre 0.4 i 4");
		}
	}

	//faig override per obtenir valor de diàmetre i comparar rodes.
	@Override
	public String toString() {
		String diameterString = Double.toString(diameter);
		return diameterString;
	}
}
