package JavaStreamPractice.DSA;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        System.out.println(result);
    }
}


