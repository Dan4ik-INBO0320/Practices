package Prac_2;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball(10, 5);

        System.out.println(b1.toString());

        b1.move(100,100);

        System.out.println(b1.toString());

    }
}
