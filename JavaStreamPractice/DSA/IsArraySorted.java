package JavaStreamPractice.DSA;

import java.util.SortedSet;

public class IsArraySorted {

    public static boolean isSorted(int[] arr) {

        boolean isSort = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSort = false;
            }
        }
        return isSort;
    }

    public static void main(String[] args) {
        int[] arr = {12, 33, 65, 77, 99};
        System.out.println(IsArraySorted.isSorted(arr));
    }
}
