package edu.umb.cs680.hw11;

import java.util.ArrayList;

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
}