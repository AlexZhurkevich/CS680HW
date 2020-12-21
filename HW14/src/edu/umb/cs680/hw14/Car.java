package edu.umb.cs680.hw14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;



public class Car {

    protected String make, model;
    protected int mileage, year;
    protected float price;
    protected int domination = 0;

    public Car(String make, String model, int mileage, int year, float price) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }

    public void setDominationCount(ArrayList<Car> cars){
        for(Car car: cars) {
            if (this.price >= car.getPrice() && this.year >= car.getYear() && this.mileage >= car.getMileage()) {
                    this.domination++;
                
            }
        }
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getMileage() {
        return this.mileage;
    }

    public int getYear() {
        return this.year;
    }

    public float getPrice() {
        return this.price;
    }

    public int getDominationCount(){
        return this.domination;
    }

    //Vanilla requirement
    public static void sortVanillaMileageAscending(ArrayList<Car> car) {
		Collections.sort(car, (Car car1, Car car2) -> (int) (car1.getMileage() - car2.getMileage()));
    }
    
    public static void sortVanillaYearAscending(ArrayList<Car> car) {
		Collections.sort(car, (Car car1, Car car2) -> (int) (car1.getYear() - car2.getYear()));
	}

    public static void sortVanillaPriceAscending(ArrayList<Car> car) {
		Collections.sort(car, (Car car1, Car car2) -> (int) (car1.getPrice() - car2.getPrice()));
    }
    
    //Vanilla descending
    public static void sortVanillaMileageDescending(ArrayList<Car> car) {
		Collections.sort(car, (Car car1, Car car2) -> (int) (car2.getMileage() - car1.getMileage()));
    }
    
    public static void sortVanillaYearDescending(ArrayList<Car> car) {
		Collections.sort(car, (Car car1, Car car2) -> (int) (car2.getYear() - car1.getYear()));
    }
    
    public static void sortVanillaPriceDescending(ArrayList<Car> car) {
		Collections.sort(car, (Car car1, Car car2) -> (int) (car2.getPrice() - car1.getPrice()));
    }
    
    //Optional Comparator.comparing() 
    public static void sortOptionalMileageAscending(ArrayList<Car> car) {
		Collections.sort(car, Comparator.comparing(Car::getMileage, Comparator.naturalOrder()));
	}

    public static void sortOptionalYearAscending(ArrayList<Car> car) {
		Collections.sort(car, Comparator.comparing(Car::getYear, Comparator.naturalOrder()));
	}

    public static void sortOptionalPriceAscending(ArrayList<Car> car) {
		Collections.sort(car, Comparator.comparing(Car::getPrice, Comparator.naturalOrder()));
    }
    
    //Optional Comparator.comparing() descending
    public static void sortOptionalMileageDescending(ArrayList<Car> car) {
		Collections.sort(car, Comparator.comparing(Car::getMileage, Comparator.reverseOrder()));
	}

    public static void sortOptionalYearDescending(ArrayList<Car> car) {
		Collections.sort(car, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
	}

    public static void sortOptionalPriceDescending(ArrayList<Car> car) {
		Collections.sort(car, Comparator.comparing(Car::getPrice, Comparator.reverseOrder()));
    }

    //Pareto 
    //Vanilla requirement
    public static void sortVanillaParetoAscending(ArrayList<Car> car) {
		Collections.sort(car, (Car car1, Car car2) -> (int) (car1.getDominationCount() - car2.getDominationCount()));
	}

    //Vanilla descending
    public static void sortVanillaParetoDescending(ArrayList<Car> car) {
		Collections.sort(car, (Car car1, Car car2) -> (int) (car2.getDominationCount() - car1.getDominationCount()));
	}

    //Optional Comparator.comparing() 
    public static void sortOptionalParetoAscending(ArrayList<Car> car) {
		Collections.sort(car, Comparator.comparing(Car::getDominationCount, Comparator.naturalOrder()));
	}

    //Optional Comparator.comparing() descending
    public static void sortOptionalParetoDescending(ArrayList<Car> car) {
		Collections.sort(car, Comparator.comparing(Car::getDominationCount, Comparator.reverseOrder()));
	}

}