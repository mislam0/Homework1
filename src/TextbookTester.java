//Mohammed Islam, Intermediate Programming Homework assignment for Chapter 1
//This class tests the Textbook class by creating objects and invoking the methods.

public class TextbookTester {
    public static void main(String[] args) {
        //No argument constructor
        Textbook defaultTextbook = new Textbook();
        System.out.println("Default Textbook:");
        System.out.println(defaultTextbook);
        System.out.println("Age of default textbook: " + defaultTextbook.calculateAge() + " years");
        System.out.println();

        Textbook programmingBook = new Textbook("Java Programming", "John Doe", 2020, "Computer Science", 500);
        System.out.println("Programming Textbook:");
        System.out.println(programmingBook);
        System.out.println("Age of programming textbook: " + programmingBook.calculateAge() + " years");
        System.out.println();

        //Changing the programming book using setters
        programmingBook.setTitle("Advanced Java Programming");
        programmingBook.setPageCount(600);

        System.out.println("Modified Programming Textbook:");
        System.out.println(programmingBook);
        System.out.println();

        //Using getters to print the information
        System.out.println("Specific details of the programming book:");
        System.out.println("Title: " + programmingBook.getTitle());
        System.out.println("Author: " + programmingBook.getAuthor());
        System.out.println("Subject: " + programmingBook.getSubject());
    }
}