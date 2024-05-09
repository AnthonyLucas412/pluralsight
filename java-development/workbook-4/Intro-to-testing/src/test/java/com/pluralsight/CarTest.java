package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void accelerate_should_increaseCarSpeed_() {
        //arrange
        Car mycar = new Car("Ford", "F150 Raptor");
        int speedchange = 15;
        int expectedSpeed = 15;

        //act
        mycar.accelerate(speedchange);

        //assert
        int actualspeed = mycar.getSpeed();
        assertEquals(expectedSpeed, actualspeed);

    }
    @Test
    public void brake_should_decreaseSpeed(){

        Car mycar = new Car("Dodge", "Hellcat");
        int speedUpBy = 15;
        int slowDownby = 10;
        int expectedSpeed = 5;
        mycar.accelerate(speedUpBy);

        mycar.brake(slowDownby);

        int actualSpeed = mycar.getSpeed();
        assertEquals(expectedSpeed,actualSpeed);
    }


}