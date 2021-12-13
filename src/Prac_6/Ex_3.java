package Prac_6;

public class Ex_3 {

    public static void main(String[] args) {

        Student[] students = new Student[7];

        students[0] = new Student("Alex", "Wood", 19, 4.17);
        students[1] = new Student("John", "King", 18, 4.22);
        students[2] = new Student("Alex", "Thomas", 19, 4.5);
        students[3] = new Student("Sam", "Wood", 19, 4);
        students[4] = new Student("Nick", "Whiteman", 18, 3.77);
        students[5] = new Student("Felix", "King", 19, 4.3);
        students[6] = new Student("Hon", "James", 20, 4);

        mergeSort(students, 7);

    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
