package JavaStreamPractice.DSA;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kthsmallest {
    public static void main(String[] args) {

        //find the kth smallest and kth largest

        int[] arr = {12, 3, 4, 5, 7, 8};
        int k = 4;

      //  PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            min.add(arr[i]);
            if(min.size()>k){
                min.poll();
            }
        }
        System.out.println(min.peek());
    }
}

//o(nlogK) //O(K)