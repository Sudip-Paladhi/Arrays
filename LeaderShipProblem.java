package DSA;

public class LeaderShipProblem {
    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(a[i]);
            }
        }
    }
}
