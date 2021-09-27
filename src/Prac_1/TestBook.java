package Prac_1;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {

        Book b_1 = new Book("Мастер и Маргарита", "Михаил" , 2021);
        b_1.informationAboutBook();
        b_1.setYear(1972);
        b_1.setAuthor("Михаил Булгаков");
        b_1.informationAboutBook();

        Book b_2 = new Book("Маленький принц", 1326);
        b_2.informationAboutBook();
        b_2.setAuthor("Антуан де Сент-Экзюпери");

        Book b_3 = new Book("Преступление и наказание", "Фёдор Достоевский");
        b_3.informationAboutBook();
        b_3.setYear(894);
        b_3.informationAboutBook();
        System.out.print(b_3.getName());

    }
}
