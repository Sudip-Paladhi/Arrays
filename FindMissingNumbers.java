package DSA;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        FindMissing(a);
    }

    static void FindMissing(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        for (int j = min; j <= max; j++) {
            boolean found = false;
            for (int n : a) {
                if (j == n) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(j);
            }
        }
    }
}