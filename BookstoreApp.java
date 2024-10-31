import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Stock: " + stock);
    }
}

class Bookstore {
    private ArrayList<Book> books;

    public Bookstore() {
        books = new ArrayList<>();
    }

    // Method to add a book to the bookstore
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all available books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the bookstore.");
        } else {
            for (Book book : books) {
                book.displayBookInfo();
            }
        }
    }

    // Method to search for a book by title
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void purchaseBook(String title) {
        Book book = searchBook(title);
        if (book != null) {
            if (book.getStock() > 0) {
                book.setStock(book.getStock() - 1);
                System.out.println("You have purchased: " + book.getTitle());
            } else {
                System.out.println("Sorry, this book is out of stock.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
}


public class BookstoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookstore bookstore = new Bookstore();

        // Adding some sample books to the bookstore
        bookstore.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 10.99, 5));
        bookstore.addBook(new Book("1984", "George Orwell", 8.99, 3));
        bookstore.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99, 4));

        System.out.println("Welcome to the Bookstore!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View all books");
            System.out.println("2. Search for a book");
            System.out.println("3. Purchase a book");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the scanner buffer

            switch (choice) {
                case 1:
                    bookstore.displayBooks();
                    break;

                case 2:
                    System.out.print("Enter the title of the book: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = bookstore.searchBook(searchTitle);
                    if (foundBook != null) {
                        foundBook.displayBookInfo();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the title of the book you want to purchase: ");
                    String purchaseTitle = scanner.nextLine();
                    bookstore.purchaseBook(purchaseTitle);
                    break;

                case 4:
                    System.out.println("Thank you for visiting the bookstore!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
