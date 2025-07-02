package JavaStreamPractice.DSA;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOneMethod(int[] num) {

        for (int i = num.length - 1; i > 0; i--) {
            if (num[i] < 9) {
                num[i] = num[i] + 1;
                return num;
            }
        }
        int[] arr = new int[num.length+1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {9, 9, 9};
        System.out.println(Arrays.toString(PlusOne.plusOneMethod(arr1)));
        System.out.println(Arrays.toString(PlusOne.plusOneMethod(arr2)));


    }
}
