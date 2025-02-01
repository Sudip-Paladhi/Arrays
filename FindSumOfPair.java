package DSA;

public class FindSumOfPair {
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 8, 10};
        int sum = 10;
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] + a[i + 1]) == sum) {
                System.out.println("Pair of sum is : " + a[i] + "," + a[i + 1]);
            }
        }
    }
}
