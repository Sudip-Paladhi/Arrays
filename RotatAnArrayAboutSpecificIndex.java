package DSA;

public class RotatAnArrayAboutSpecificIndex {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] rotatArray = new int[a.length];
        int index = 3;
        int k = 0;

        for (int i = 0; i < index; i++) {
            rotatArray[k++] = a[i];
        }
        for (int i = a.length - 1; i >= index; i--) {
            rotatArray[k++] = a[i];
        }
        for (int n : rotatArray) {
            System.out.println(n);
        }
    }
}
