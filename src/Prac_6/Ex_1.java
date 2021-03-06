package Prac_6;

public class Ex_1 {

    public static void main(String[] args) {

        Student[] students = new Student[6];

        students[0] = new Student("Alex", "Wood", 19, 4.17);
        students[1] = new Student("John", "King", 18, 4.22);
        students[2] = new Student("Alex", "Thomas", 19, 4.5);
        students[3] = new Student("Sam", "Wood", 19, 4);
        students[4] = new Student("Nick", "Whiteman", 18, 3.77);
        students[5] = new Student("Felix", "King", 19, 4.3);

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                if (students[i].getGPA() < students[j].getGPA()) {
                    Student temp = students[i];
                    for (int k = i - 1; k >= j; k--) { students[k+1] = students[k]; }
                    students[j] = temp;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(students[i].toString());
        }
    }
}