package DSA;

public class MargeTwoArrayAndRemoveDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 3};
        int[] b = {9, 8, 7, 9, 8, 7};
        int[] c = merg(a, b);
        // duplicate(c);
        sort(c);
        for (int n : c) {
            System.out.println(n);
        }

    }

    static int[] merg(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            c[index++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[index++] = b[i];
        }
        return c;
    }

//    static void duplicate(int[] a) {
//        int index = 0;
//        for (int i = 0; i < a.length; i++) {
//            boolean duplicate = false;
//            for (int j = 0; j < index; j++) {
//                if (a[j] == a[i]) {
//                    duplicate = true;
//                    break;
//                }
//            }
//
//            if (!duplicate) {
//                a[index++] = a[i];
//            }
//        }
//        for (int i = 0; i < index; i++) {
//            System.out.println(a[i]);
//        }
//    }

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}