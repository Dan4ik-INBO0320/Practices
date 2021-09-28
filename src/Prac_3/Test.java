package Prac_3;
/*
public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape. Объявляем объект класса Circle и преобразовываем его в класс Shape.
        System.out.println(s1); // вывод значения элемента памяти, в которой хранится информация об объекте s1
        System.out.println(s1.getArea()); // вызов метода класса Shape
        System.out.println(s1.getPerimeter()); // Попытка вызова абстрактного метода класса Shape. Ошибка
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius()); // Попытка вызова метода класса Circle. Он не доступен, т.к. объект s1 относится к класу Shape. Ошибка

        Circle c1 = (Circle)s1; // Downcast back to Circle. Объявляем объект c1 класса Circle и присваиваем ему ссылку на объект s1,
                                // класс которого был переопределен из Shape в Circle
                                // Т.к. изначально объект s1 был класса Circle, но сразу был переопределен в класс Shape, при возвращении в класс
                                // Circle у него вновь появляется доступ к методам класса Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); // Попытка объявления объекта абстрактного класса. Ошибка
                                // Абстрактный класс предназначен только для наследования, а не использования его при помощи объектов

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast. Объявление объекта класса Rectangle и преобразование его
                                                                                 // в класс Shape
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // Попытка вызова объектов класса Shape метода класса Rectangle

        Rectangle r1 = (Rectangle)s3; // downcast. Объявление объекта r1 класса Rectangle с сылкой на объект s3, класс которого был переопределен из
                                      // Ему вновь доступны методы класса Rectangle, т.к. он изначально был объявлен этим классом
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());
        28

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getSide());
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
*/