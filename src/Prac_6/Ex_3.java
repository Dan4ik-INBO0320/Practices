//package Prac_6;
//
//public class Ex_3 {
//
////    public static void main(String[] args) {
////
////        Student[] students = new Student[7];
////
////        students[0] = new Student("Alex", "Wood", 19, 4.17);
////        students[1] = new Student("John", "King", 18, 4.22);
////        students[2] = new Student("Alex", "Thomas", 19, 4.5);
////        students[3] = new Student("Sam", "Wood", 19, 4);
////        students[4] = new Student("Nick", "Whiteman", 18, 3.77);
////        students[5] = new Student("Felix", "King", 19, 4.3);
////        students[6] = new Student("Hon", "James", 20, 4);
////
////        mergeSort(students, 7);
////
////    }
////
////    public static void mergeSort(int[] a, int n) {
////        if (n < 2) {
////            return;
////        }
////        int mid = n / 2;
////        int[] l = new int[mid];
////        int[] r = new int[n - mid];
////
////        for (int i = 0; i < mid; i++) {
////            l[i] = a[i];
////        }
////        for (int i = mid; i < n; i++) {
////            r[i - mid] = a[i];
////        }
////        mergeSort(l, mid);
////        mergeSort(r, n - mid);
////
////        merge(a, l, r, mid, n - mid);
////    }
////
////    public static void merge(
////            int[] a, int[] l, int[] r, int left, int right) {
////
////        int i = 0, j = 0, k = 0;
////        while (i < left && j < right) {
////            if (l[i] <= r[j]) {
////                a[k++] = l[i++];
////            }
////            else {
////                a[k++] = r[j++];
////            }
////        }
////        while (i < left) {
////            a[k++] = l[i++];
////        }
////        while (j < right) {
////            a[k++] = r[j++];
////        }
////    }
//
//    public static void Merge_(Comparable[] arr, int left, int middle, int right){
//        int n1 = middle - left + 1;
//        int n2 = right - middle;
//
//        Comparable[] L = new Comparable[n1];
//        Comparable[] R = new Comparable[n2];
//
//        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
//        for (int i = 0; i < n2; i++) R[i] = arr[middle + 1 + i];
//
//        int i = 0, j = 0;
//
//        int k = left;
//        while (i < n1 && j < n2) {
//            if (L[i].compareTo(R[j]) <= 0 ) {
//                arr[k] = L[i];
//                i++;
//            }
//            else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
//    public static void MergeSort_(Comparable[] arr, int left, int right) {
//        if (left < right) {
//            int middle = left + (right - left) / 2;
//
//            MergeSort_(arr, left, middle);
//            MergeSort_(arr, middle + 1, right);
//
//            Merge_(arr, left, middle, right);
//        }
//    }
//
//    public static void main(String[] args) {
//        Comparable[] students_1 = new Comparable[4];
//        students_1[0] = (new Student("Ivan", "Nefedov", 10, 3, 4.14));
//        students_1[1] = (new Student("Artem", "Azurov", 15, 8, 3.69));
//        students_1[2] = (new Student("Vladimir", "Mencov", 11, 3, 4.81));
//        students_1[3] = (new Student("Sergey", "Borovenok", 18, 11, 3.06));
//
//        Comparable[] students_2 = new Comparable[3];
//        students_2[0] = (new Student("Alex", "Zubov", 15, 9, 3.54));
//        students_2[1] = (new Student("Maria", "Rulle", 9, 2, 3.69));
//        students_2[2] = (new Student("Petr", "Serov", 12, 5, 4.88));
//
//        Comparable[] students = new Comparable[students_1.length + students_2.length];
//
//        for (int i = 0; i < students_1.length; i++) students[i] = students_1[i];
//
//        for (int i = 0; i < students_2.length; i++) students[i + students_1.length] = students_2[i];
//
//        System.out.println("Array before sort");
//        for (int i = 0; i < students.length; i++) System.out.println(students[i]);
//
//        MergeSort_(students, 0, students.length-1);
//
//        System.out.println("\nArray after sort");
//        for (int i = 0; i < students.length; i++) System.out.println(students[i]);
//    }
//
//
//
//}
