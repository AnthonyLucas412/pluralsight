package com.pluralsight;

public class Person {
    private String name;
    private int age;
    private int energy;

public Person(){

}
public Person(String name){
    this.name = name;
}
public Person (int age){
    this.age = age;

}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnergy() {
        return energy;
    }

    public void work(int hours) {
        this.energy -= (hours * 10);
    }

    public void sleep(int hours) {
        this.energy += (hours * 10);
    }

    public void eat() {
        this.energy += 20;
    }

    public void greet(String name){
        System.out.println("Hello " + name);

    }
    public void Person2(String name){
        this.name = name;
    }
}
