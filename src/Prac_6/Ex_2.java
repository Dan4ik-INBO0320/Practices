package Prac_6;

public class Ex_2 {

    public static void main(String[] args) {

        Student[] students = new Student[7];

        students[0] = new Student("Alex", "Wood", 19, 4.17);
        students[1] = new Student("John", "King", 18, 4.22);
        students[2] = new Student("Alex", "Thomas", 19, 4.5);
        students[3] = new Student("Sam", "Wood", 19, 4);
        students[4] = new Student("Nick", "Whiteman", 18, 3.77);
        students[5] = new Student("Felix", "King", 19, 4.3);
        students[6] = new Student("Hon", "James", 20, 4);

        SortingStudentsByGPA sorting = new SortingStudentsByGPA();

        sorting.quickSort(students, 0, students.length-1);

        for (int i = 0; i < students.length-1; i++) {
            System.out.println(students[i].toString());
        }
    }
}