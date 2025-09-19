/**
 * Book class - Student Assignment
 *
 * Complete all the TODO sections to create a fully functional Book class.
 * This class represents a book with title, author, number of pages, and price.
 *
 * Test your implementation using the BookDemo class.
 *
 * @author [Your Name]
 * @version 1.0
 */
public class Book {

    private  String title;
    private  String author;
    private  int pages;
    private  double price;
    // Hint: You need String title, String author, int pages, double price





    /**
     * Default constructor - creates a book with default values
     * - title: "Unknown Title"
     * - author: "Unknown Author"
     * - pages: 0
     * - price: 0.0
     */
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.pages = 0;
        this.price = 0.0;
    }

    /**
     * Parameterized constructor
     * Set title and author directly, but use setPages() and setPrice()
     * methods for validation
     */
    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        setPages(pages);
        setPrice(price);
    }

    /**
     * Copy constructor
     */
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.pages = other.pages;
        this.price = other.price;

    }

    // GETTER METHODS

    /**
     * Gets the book's title
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the book's author
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the number of pages
     * @return the number of pages in the book
     */
    public int getPages() {
        return pages;
    }

    /**
     * Gets the book's price
     * @return the price of the book
     */
    public double getPrice() {
        return price;
    }

    // SETTER METHODS WITH VALIDATION

    /**
     * Sets the book's title
     * @param title the new title for the book
     */
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            this.title = title;
        }else  {
            System.out.println("Title invalid");
        }

    }

    /**
     * Sets the book's author
     * @param author the new author for the book
     */
    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            this.author = author;
        }else  {
            System.out.println("Author invalid");
        }

    }

    /**
     * Sets the number of pages
     * @param pages the new number of pages
     */
    public void setPages(int pages) {
        if (pages >= 0) {
            this.pages = pages;
        }else{
            System.out.println("Pages invalid");
        }

    }

    /**
     * Sets the book's price
     * @param price the new price for the book
     */
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }else {
            System.out.println("Price invalid");
        }

    }

    // UTILITY METHODS
    // TODO 7: Implement utility methods that provide useful functionality

    /**
     * Calculates estimated reading time in minutes
     * TODO: Use these assumptions:
     * - 250 words per page
     * - 200 words per minute reading speed  
     * - Formula: (pages * 250) / 200
     * @return estimated reading time in minutes
     */
    public double calculateReadingTime() {
        int time = (pages * 250) / 200;
        return time;
    }

    /**
     * Determines if this book is expensive
     * @return true if the book costs more than $25.00
     */
    public boolean isExpensive() {
        if (price > 25) {
            return true;
        }else  {
            return false;
        }
    }

    /**
     * Determines if this book is long
     * @return true if the book has more than 300 pages
     */
    public boolean isLongBook() {
        if (pages > 300) {
            return true;
        }else   {
            return false;
        }
    }

    /**
     * Calculates the price per page
     * IMPORTANT: If pages is 0, return 0.0 to avoid division by zero
     * @return price per page, or 0.0 if no pages
     */
    public double getPricePerPage() {
        if (pages <= 0){
            return 0.0;
        }else   {
            return price / pages;
        }
    }

    /**
     * Applies a discount to the book's price
     * TODO: Apply discount only if discountPercent is between 0 and 100 (inclusive)
     * Formula: newPrice = currentPrice * (1 - discountPercent/100)
     * Example: 20% discount means multiply price by 0.8
     * @param discountPercent the discount percentage (0-100)
     */
    public void applyDiscount(double discountPercent) {
        if (discountPercent >= 0.0 && discountPercent <= 100) {
            return newprice = price * (1 - discountPercent/100);
        }


    }

    // OVERRIDE METHODS
    // TODO 8: Override Object class methods

    /**
     * Returns a string representation of the book
     * Use String.format() to ensure price shows exactly 2 decimal places
     * Example: Book: "1984" by George Orwell (328 pages, $13.99)
     */
    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + pages + "pages, " + price + ")";
    }

    /**
     * Checks if this book is equal to another object
     * TODO: Follow the standard equals() pattern:
     * 1. Check if obj is the same reference as this (this == obj)
     * 2. Check if obj is null or not the same class
     * 3. Cast obj to Book and compare all fields
     * 4. For price comparison, use Double.compare(price, other.price) == 0
     * 5. For String comparison, use the equals() method
     * @param obj the object to compare with
     * @return true if the objects are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            if (obj == null || obj.getClass() != this.getClass()) {
                obj = book;
                Double.compare(price, other.price) == 0
                return true;
            }
        }
    }
}