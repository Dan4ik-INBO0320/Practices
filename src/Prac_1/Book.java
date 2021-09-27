package Prac_1;

import java.lang.*;
public class Book {

    private String name;
    private String author;
    private int year;

    public Book(String n, String a, int y) {
        name = n;
        author = a;
        year = y;
    }

    public Book(String n, String a) {
        name = n;
        author = a;
        year = 0;
    }

    public Book(String n, int y) {
        name = n;
        author = "Unknown";
        year = y;
    }

    public Book() {
        name = "Unknown";
        author = "Unknown";
        year = 0;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setYear(int y) {
        year = y;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "name " + this.name + ", author " + author + ", year " + year;
    }

    public void informationAboutBook() {
        System.out.print("Книга " + name + ", автор " + author + ", " + year + " года выпуска.\n");
    }

}
