package DSA;

public class CountEnenOrOdd {
    public static void main(String[] args) {
        int[] a = {8, 5, 7, 9, 6, 4, 1, 2, 3};
        int evenCount = 0;
        int OddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                OddCount++;
            }
        }
        System.out.println("Total even number is: " + evenCount);
        System.out.println("Total Odd number is : " + OddCount);
    }
}
