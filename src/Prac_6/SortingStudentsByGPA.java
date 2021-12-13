package Prac_6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public void quickSort(Student[] s ,int a, int b) {

        int start = a;

        for (int i = a + 1; i <= b; i++) {
            if (compare(s[i], s[start]) == -1) {
                Student temp = s[i];
                for (int k = i - 1; k >= start; k--) { s[k+1] = s[k]; }
                s[start] = temp;
                start++;
            }
        }

        if (start - a - 1 >= 2) quickSort(s, a, start - 1);

        if (b - start >= 2) quickSort(s, start + 1, b);

    }

    public int compare(Student s1, Student s2) {

        if (s1.getGPA() > s2.getGPA()) return 1;
        else if (s1.getGPA() < s2.getGPA()) return -1;
        else return 0;

    }
}