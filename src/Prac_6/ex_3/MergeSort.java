package Prac_6.ex_3;

public class MergeSort {

    public static void Merge_(Comparable[] arr, int left, int middle, int right){
        int n1 = middle - left + 1;
        int n2 = right - middle;

        Comparable[] L = new Comparable[n1];
        Comparable[] R = new Comparable[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[middle + 1 + i];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0 ) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void MergeSort_(Comparable[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            MergeSort_(arr, left, middle);
            MergeSort_(arr, middle + 1, right);

            Merge_(arr, left, middle, right);
        }
    }

    public static void main(String[] args) {
        Comparable[] students_1 = new Comparable[4];
        students_1[0] = (new Student("John", "Wood", 17, 5, 3.81));
        students_1[1] = (new Student("Hon", "James", 18, 2, 3.6));
        students_1[2] = (new Student("Alex", "Whiteman", 17, 15, 3.31));
        students_1[3] = (new Student("George", "Brown", 18, 11, 4.66));

        Comparable[] students_2 = new Comparable[3];
        students_2[0] = (new Student("Marry", "Pulze", 19, 9, 3.24));
        students_2[1] = (new Student("Sofy", "Marker", 18, 9, 4.69));
        students_2[2] = (new Student("Tom", "Sedvigh", 17, 5, 3.88));

        Comparable[] students = new Comparable[students_1.length + students_2.length];

        for (int i = 0; i < students_1.length; i++) students[i] = students_1[i];

        for (int i = 0; i < students_2.length; i++) students[i + students_1.length] = students_2[i];

        System.out.println("Array before sort");
        for (int i = 0; i < students.length; i++) System.out.println(students[i]);

        MergeSort_(students, 0, students.length-1);

        System.out.println("\nArray after sort");
        for (int i = 0; i < students.length; i++) System.out.println(students[i]);
    }

}