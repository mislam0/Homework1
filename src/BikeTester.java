//Mohammed Islam, Intermediate Programming Homework assignment for Chapter 1
//This class tests the Bike class by creating objects and then doing them.

import java.util.ArrayList;

public class BikeTester {
    public static void main(String[] args) {
        //No arg constructor
        Bike bike1 = new Bike();
        System.out.println("Bike 1 details:");
        System.out.println(bike1);
        System.out.println();

        //Creating bike2 and using setter methods to change values
        Bike bike2 = new Bike();
        bike2.setNumberOfWheels(3);
        bike2.setManufacturer("Trek");
        bike2.setYear(2022);
        bike2.setColor("Blue");
        System.out.println("Bike 2 details:");
        System.out.println(bike2);
        System.out.println();

        //Creating an ArrayList of bikes
        ArrayList<Bike> bikeList = new ArrayList<>();

        bikeList.add(bike1);
        bikeList.add(bike2);

        System.out.println("Bike List:");
        for (Bike bike : bikeList) {
            System.out.println(bike);
            System.out.println();
        }

        //Counting total number of wheels
        int totalWheels = 0;
        for (Bike bike : bikeList) {
            totalWheels += bike.getNumberOfWheels();
        }
        System.out.println("Total number of wheels: " + totalWheels);

        //Finding the year of the oldest bike
        int oldestYear = Integer.MAX_VALUE;
        for (Bike bike : bikeList) {
            if (bike.getYear() < oldestYear) {
                oldestYear = bike.getYear();
            }
        }
        System.out.println("Year of the oldest bike: " + oldestYear);
    }
}