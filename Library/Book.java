/* Last modified: 2023-04-29 */

package Sem2.li;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String genre;
    private String ISBN;
    private double rating;
    private boolean checkedOut;
    private String checkedOutBy;

    private LocalDate due = LocalDate.now();
    private LocalDate checkedOutDate;;

    private LocalDate d1 = LocalDate.now();

    public Book(String titleIn, String authorIn, String genreIn, String ISBNIn, double ratingIn) {
        this.title = titleIn;
        this.author = authorIn;
        this.genre = genreIn;
        this.ISBN = ISBNIn;
        this.rating = ratingIn;
        this.checkedOut = false;
    }

    public String toString() {
        String coInfo = "No checkout information, book isn't checked out.";
        if (checkedOut) {
            coInfo = "Checked out by: " + checkedOutBy + " on " + this.checkedOutDate + ", Due: " + this.due;
        }

        return "Title: " + this.title + "\nAuthor: " + this.author + "\nGenre: " + this.genre + "\nISBN: " + this.ISBN
                + "\nRating: " + this.rating + "\n" + coInfo + "\n----====0====----\n";
    }

    // Getters n such
    public String gTitle() {
        return this.title;
    }

    public String gAuthor() {
        return this.author;
    }

    public String gGenre() {
        return this.genre;
    }

    public String gISBN() {
        return this.ISBN;
    }

    public double gR8in() {
        return this.rating;
    }

    public boolean isOut() {
        return this.checkedOut;
    }

    // Setters n suc
    public void setAuthor(String authorIn) {
        this.author = authorIn;
    }

    public void setRating(String ratingIn) {
        this.author = ratingIn;
    }

    public void checkIn() {
        this.checkedOut = false;
        System.out.println("This book has been checked in:\n" + toString());

    }

    public void checkOut(String by) {
        this.checkedOut = true;
        this.checkedOutBy = by;
        this.checkedOutDate = LocalDate.now();
        this.due = d1.plusDays(10);
        System.out.println("This book has been checked out:\n" + toString());
    }
}
