package JavaStreamPractice.DSA;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7, 8};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                System.out.println(arr[i]);
            }
            set.add(arr[i]);
        }
    }
}
