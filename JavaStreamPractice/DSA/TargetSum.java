package JavaStreamPractice.DSA;

import java.util.HashMap;

public class TargetSum {


    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 2};

        int target = 7;


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int tar = target - arr[i];

            if (map.containsKey(tar)) {
                System.out.println(map.get(tar));
                System.out.println(i);
            }
            map.put(arr[i], i);
        }

    }
}
