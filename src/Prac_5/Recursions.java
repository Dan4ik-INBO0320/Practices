package Prac_5;

import java.util.Scanner;

public class Recursions {


    public static int ex_6(int n, int del) {

        if (del > n / 2) return 0;

        if (n % del == 0) return -1;

        return ex_6(n, ++del);

    }

    public static void ex_7(int n, int del) {

        if (n != 1) {

            if (n == del || del > n / 2) System.out.print(n);

            else {

                if (n % del == 0) {
                    System.out.print(del + "*");
                    ex_7(n / del, del);
                }

                else {
                    ex_7(n, ++del);
                }

            }

        }

    }

    public static int ex_8(String s, int length, int x) {

        if (s.charAt(x) != s.charAt(length - 1 - x)) return -1;

        if (length % 2 == 1 && x == length / 2) return 0;

        if (x + 1 == length - 1 - x) return 0;

        return ex_8(s, length, ++x);

    }

    public static int ex_10(int x, int res) {


        if (res == -1) {
            res = x % 10;
            x /= 10;
        }

        else {
            res *= 10;
            res += x % 10;
            x /= 10;
        }

        if (x == 0) return res;


        return ex_10(x, res);

    }




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int key = 1;

        while (key != 0) {

            System.out.print("Введите число от 6 до 9 для выбора упражнения, или 0 для выхода: ");
            key = scan.nextInt();


            switch (key) {

                case 6: {

                    System.out.print("Упражнение 6: проверка числа на простоту." + "\n" + "Введите число(>1) для проверки: ");
                    int x = scan.nextInt();

                    if (ex_6(x, 2) == 0) System.out.println("YES");
                    else System.out.println("NO");
                    break;
                }

                case 7: {

                    System.out.println("Упражнение 7: разложение на множители." + "\n" + "Введите число(>1) для разложения: ");
                    int x = scan.nextInt();

                    ex_7(x, 2);

                    System.out.println();

                    break;

                }

                case 8: {

                    System.out.println("Упражнение 8: палиндром." + "\n" + "Введите строку для проверки слова на полиндром: ");

                    String s = scan.next();
                    int length = s.length();

                    if (ex_8(s, length, 0) == 0) System.out.println("YES");
                    else System.out.println("NO");

                    break;

                }

                case 10: {

                    System.out.print("Упражнение 10: разворот числа." + "\n" + "Введите число для разворота: ");
                    int x = scan.nextInt();

                    System.out.println(ex_10(x, -1));

                }

            }

        }

    }

}
