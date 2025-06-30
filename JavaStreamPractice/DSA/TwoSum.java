package JavaStreamPractice.DSA;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println(i + " " + j);
                break;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }

    }
}

//O(N)....O(1)
