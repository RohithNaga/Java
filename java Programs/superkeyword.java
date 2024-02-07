package practisePrograms;

import java.util.*;
import java.io.*;

class vehicle {
    int speed;

    public vehicle(int speed) {
        this.speed = speed;
    }
    public void displayinfo() {
        System.out.println("the speed of the vehicle is: " + speed);
    }
}

class car extends vehicle {
    int seats;

    public car(int speed, int seats) {
        super(speed);
        this.seats = seats;
    }
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("number of seats in the car: " + seats);
    }

    public void drive() {
        System.out.println("the car is being driven. ");
    }
}


public class superkeyword {
    public static void main(String[] args) {
        car mycar = new car(190, 4);

        mycar.displayinfo();
        mycar.drive();
    }
}
