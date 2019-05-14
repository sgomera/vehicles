package com.vehicles.project;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        enterVehicle();

    }

    //mètode per preguntar a l'usuari si vol crear un cotxe o una moto:
    public static void enterVehicle() throws Exception {
        String transport = getInput("Vols crear una moto o un cotxe?");
        if (transport.equalsIgnoreCase("cotxe")){
            createCar();
        } else if (transport.equalsIgnoreCase( "moto")){
            createBike();
        } else {
            System.out.println("Tipus de vechicle incorrecte");
        }
    }
//mètode per crear la moto
    public static void createBike() throws Exception {
        //demanar dades moto i crear-la
        Bike bike = enterBike();
        System.out.println("");

        //Afegir rodes segons dades usuari
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(enterWheel());
        wheels.add(enterWheel());

        //Afegir rodes a la moto
        bike.addWheels(wheels);
    }

//mètode per crear el cotxe
    public static void createCar () throws Exception {
        // 1.1 i 1.2 (demanar dades cotxe i crear-lo
        Car cotxe = enterCar();
        System.out.println(" ");

        //1.3 Afegit rodes posteriors:
        List<Wheel> backWheels = new ArrayList<>();
        createAxis(backWheels, "posterior");
        System.out.println(" ");

        //1.4 Afegir rodes anteriors:
        List<Wheel> frontWheels = new ArrayList<>();
        createAxis(frontWheels, "anterior");
        System.out.println(" ");

        //Afegir rodes al cotxe
        cotxe.addWheels(backWheels, frontWheels);
    }



//mètode per preguntar a l'usuari les dades de la moto
    public static Bike enterBike() throws Exception {
        //demanem a l'usuari matrícula, marca i color
        String plate = getInput("Quina és la matrícula de la moto? ");
        String brand = getInput("De quina marca és? ");
        String color = getInput("De quin color és? ");
        // instanciem la moto com a objecte de la subclasse Bike
        Bike b1 = new Bike(plate, brand, color);
        System.out.println("S'ha creat la moto.");
        return b1;
    }



//mètode per preguntar les dades del cotxe a l'usuari i crear-lo
    public static Car enterCar() throws Exception {
        // 1) demanem a l'usuari matrícula, marca i color
        String plate = getInput("Quina és la matrícula del cotxe? ");
        String brand = getInput("De quina marca és? ");
        String color = getInput("De quin color és? ");

        // 2) instanciem el v1 com a objecte de la classe subclasse Car
        Car v1 = new Car(plate, brand, color);
        System.out.println("S'ha creat el cotxe.");
        return v1;
    }

//mètode per indicar de quin eix i roda l'usuari ha de donar les dades
    public static List<Wheel> createAxis(List<Wheel> wheels, String wheelsPos){

        System.out.println("A continuació introdueix marca i diàmetre de les rodes " + wheelsPos + "s.");

        System.out.println("Roda " + wheelsPos + " dreta: ");
        wheels.add(enterWheel());

        System.out.println("Roda " + wheelsPos + " esquerra: ");
        wheels.add(enterWheel());

        return wheels;
    }


//mètode per demanar a l'usuari dades d'una roda concreta
    public static Wheel enterWheel(){
        //demanem a l'usuari les dades de la roda
        String brand = getInput("marca de la roda? ");
        String diameterString = getInput("diàmetre de la roda? ");
        double diameter = Double.parseDouble(diameterString);

        //instanciem roda
        Wheel roda = new Wheel(brand, diameter);
        return roda;
    }



    //mètode per fer preguntes i retornar les respostes de l'usuari
    public static String getInput(String frase){
        System.out.print(frase);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }


}
