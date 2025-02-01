package DSA;

public class MoveNegativeToTheBeginingAndPositiveToEnd {
    public static void main(String[] args) {

        int[] a = {5, 1, 2, -2, 4, 8, -8, -7};
        int[] temp = new int[a.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                temp[index++] = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                temp[index++] = a[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }


//        int index=0;
//        for (int i = 0; i < a.length; i++) {
//            if(a[i]<0){
//                int temp= a[i];
//                a[i]= a[index];
//                a[index++]= temp;
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }


    }

}