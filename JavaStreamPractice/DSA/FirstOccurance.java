package JavaStreamPractice.DSA;

public class FirstOccurance {

    public static int findFirstOccurance(int[] arr, int target) {

        int k = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int i = 99;

        int[] arr = {14, 29, 47, 99, 100, 66};

        System.out.println(FirstOccurance.findFirstOccurance(arr, i));


    }
}
