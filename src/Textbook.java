//Mohammed Islam, Intermediate Programming Homework assignment for Chapter 1
//This class models a Textbook with their attributes and methods.

public class Textbook {
    private String title;
    private String author;
    private int publicationYear;
    private String subject;
    private int pageCount;

    //No argument constructor
    public Textbook() {
        this.title = "Untitled Textbook";
        this.author = "Unknown Author";
        this.publicationYear = 2023;
        this.subject = "General";
        this.pageCount = 100;
    }

    public Textbook(String title, String author, int publicationYear, String subject, int pageCount) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.subject = subject;
        this.pageCount = pageCount;
    }

    //Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public String getSubject() { return subject; }
    public int getPageCount() { return pageCount; }

    //Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

    //Calculates the age of the textbook based on the current year. @return The age of the textbook in years.
    public int calculateAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - this.publicationYear;
    }

    //Returns a string representing the Textbook.

    @Override
    public String toString() {
        return "Textbook Details:\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Publication Year: " + publicationYear + "\n" +
                "Subject: " + subject + "\n" +
                "Page Count: " + pageCount;
    }
}