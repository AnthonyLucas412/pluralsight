package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Anthony",25);
        System.out.println(person1.getEnergy());
        person1.work(8);
        System.out.println(person1.getEnergy());
        person1.sleep(8);
        System.out.println(person1.getEnergy());

        person1.greet();
        person1.greet("Anthony");

        Person Person2 = new Person();
       Person2.setName("Anthony");








        /*Car mycar = new Car("Black","Dodge Hellcat",2024);

        mycar.accelerate(50);
        System.out.println(mycar.getSpeed());

        mycar.brake(20);
        System.out.println(mycar.getSpeed());*/



    }
}
