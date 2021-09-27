package Prac_2;

public class TestAuthor {
    public static void main(String[] args) {

        Author auth = new Author("Alex", "Alex000@gmail.com", 'm');

        System.out.println(auth.toString());

        System.out.println(auth.getEmail());
        auth.setEmail("Alex123Alex@yandex.ru");
        System.out.println(auth.getEmail());

        System.out.println(auth.toString());

    }
}
