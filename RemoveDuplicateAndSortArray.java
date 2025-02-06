package Prac;

public class RemoveDuplicateAndSortArray {
    public static void main(String[] args) {
        int[] a = {8, 8, 5, 5, 1, 1, 7, 7, 6, 9, 8, 9, 2, 3, 4};
        int[] uniqueArray = removeDuplicate(a);
        sort(uniqueArray);
        for (int n : uniqueArray) {
            System.out.println(n);
        }
    }

    static int[] removeDuplicate(int[] a) {
        int[] temp = new int[a.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < index; j++) {
                if (a[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                temp[index++] = a[i];
            }
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
