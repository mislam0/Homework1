//Mohammed Islam, Intermediate Programming Homework assignment for Chapter 1
//This class just models a Person with basic attributes.

public class Person {
    private String name;
    private int age;
    private String eyeColor;

    public Person() {
        this.name = "Claude";
        this.age = 1;
        this.eyeColor = "Blue";
    }

    //3 argument constructor
    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    //Override toString() method
    @Override
    public String toString() {
        return "Person Details: \n" +
                "Name: " + name + "\n" +
                "Age: " + age + " years\n" +
                "Eye Color: " + eyeColor;
    }

    public void talk() {
        System.out.println("Welcome, coders! I am " + name);
    }
}