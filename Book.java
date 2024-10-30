public class Book {
    private String title;
    private String author;
    private double price;
    private double setnewPrice;

    // Constructor 1: Initializes book with title only, defaults other fields
    public Book(String title) {
        this.title = title;
        this.author = "Unknown"; // Default author
        this.price = 0.0; // Default price
    }

    // Constructor 2: Initializes book with title, author, and price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Prints details of the book
    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: $%.2f%n", price);
    }


    }
