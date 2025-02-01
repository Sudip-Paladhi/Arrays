package DSA;

public class MaxDifferenceBetweenTwoNum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 31};
        int maxDifference = 0;
        for (int i = 1; i < a.length; i++) {
            int ans = a[i] - a[i - 1];
            if (ans > maxDifference) {
                maxDifference = ans;
            }
        }
        System.out.println("Maximum difference number is: " + maxDifference);
    }
}
