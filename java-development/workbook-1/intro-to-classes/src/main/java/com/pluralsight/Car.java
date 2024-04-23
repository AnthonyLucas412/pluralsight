package com.pluralsight;

public class Car {
    private String color;
    private String makeModel;
    private int speed;
    private int year;

    //*this is constructor.
    public Car(String color, String makeModel, int year) {
        this.color = color;
        this.makeModel = makeModel;
        this.speed = 0;
        this.year = year;
    }
//*this is getter and setter.
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void accelerate(int increment){
        this.speed += increment;
    }

    public void brake (int decrement){
        this.speed += decrement;
    }
}
