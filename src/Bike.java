//Mohammed Islam, Intermediate Programming Homework assignment for Chapter 1
//This class models a Bike with their attributes.

public class Bike {
    private int numberOfWheels;
    private String manufacturer;
    private int year;
    private String color;

    // No argument constructor
    public Bike() {
        this.numberOfWheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
        this.color = "Red";
    }

    public Bike(int numberOfWheels, String manufacturer, int year, String color) {
        this.numberOfWheels = numberOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
    }

    //Getters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    //Setters
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Returns a string representing the Bike.

    @Override
    public String toString() {
        return "Bike Details:\n" +
                "Number of Wheels: " + numberOfWheels + "\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Year: " + year + "\n" +
                "Color: " + color;
    }
}