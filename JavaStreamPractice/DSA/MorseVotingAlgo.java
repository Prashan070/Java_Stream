package JavaStreamPractice.DSA;

public class MorseVotingAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int majority = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majority = arr[i];
                count++;
            } else if (arr[i] == majority) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(majority);
    }
}
//o(n)
//o(1)