package com.Array;
import java.util.Arrays;

public class RemoveDuplicateValue {
    public static int[] arr3(int[] a1, int[] a2) {
      int [] arr = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, arr, 0, a1.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);

        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
               arr[count++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, count);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 2, 2, 5};
        int[] arr2 = {5, 6, 7, 8, 3, 4};

        int[] result = arr3(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}