//Mohammed Islam, Intermediate Programming Homework assignment for Chapter 1
//This class tests the Person class by creating objects and running its methods

public class PersonTester {
    public static void main(String[] args) {
        //No argument constructor
        Person person1 = new Person();

        System.out.println("Initial person1 details:");
        System.out.println(person1.toString());

        //Changing the name of person1 to "Howard Roark"
        person1.setName("Howard Roark");

        //Invoking the talk() method
        System.out.println("\nAfter changing name, calling talk() method:");
        person1.talk();

        System.out.println("\nUpdated person1 details:");
        System.out.println(person1.toString());
    }
}