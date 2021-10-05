package Prac_3.Second;

public class Test {

    public static void main(String[] args) {
        MovableRectangle r1 = new MovableRectangle(0,20, 30,0, 1,2);
        r1.moveUp();
        System.out.println(r1.toString());
        r1.moveDown();
        System.out.println(r1.toString());
        r1.moveLeft();
        System.out.println(r1.toString());
        r1.moveRight();
        System.out.println(r1.toString());

        if (r1.equalSpeed()) System.out.print("Скорость точек одинаковая.");
        else System.out.print("Скорость точек разная.");

    }

}
