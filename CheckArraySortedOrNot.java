package Prac;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        if (isSorted(a)) {
            System.out.println("Sorted Array");
        } else {
            System.out.println("unsorted array");
        }
    }

    static boolean isSorted(int[] a) {
        boolean assending = true, desending = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                assending = false;
            }

            if (a[i] < a[i + 1]) {
                desending = false;
            }
        }
        return assending || desending;
    }
}
