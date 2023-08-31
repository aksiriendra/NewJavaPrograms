package Objectsandclasses;

public class Book {

    private String name;
    private String Author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.Author = author;
        this.year = year;
    }

    public void displayinfo() {
        System.out.println("Book name: " + name);
        System.out.println("Author: " + Author);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {

        Book[] book = new Book[3];

        book[0] = new Book("To kill a mocking bird", "XXXX", 1991);
        book[1] = new Book("Gtosdsds", "YYYY", 1992);
        book[2] = new Book("asdasdds", "DDDD", 1993);

        for (Book books : book) {
            books.displayinfo();
            System.out.println("----------------------------------------------");
        }

    }

}