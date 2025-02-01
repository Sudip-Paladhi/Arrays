package DSA;

public class CheckArraySortedOrNot {


    public static void main(String[] args) {
        int[] a = {8, 7, 6, 5, 4, 3, 2, 1, 41};
        if (Sorted(a)) {
            System.out.println("Given array is : Sorted");
        } else {
            System.out.println("Given array is : Not sorted");
        }
    }

    static boolean Sorted(int[] a) {
        boolean assending = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                assending = false;
                break;
            }
        }
        boolean dessending = true;
        if (!assending) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    dessending = false;
                }
            }
            return dessending;
        }
        return assending;
    }
}