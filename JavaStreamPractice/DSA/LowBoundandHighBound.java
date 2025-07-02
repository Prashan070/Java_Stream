package JavaStreamPractice.DSA;

public class LowBoundandHighBound {

    public static int lowerBound(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }

    public static int higherBound(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        int ans = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] > target) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 44, 55, 66, 66, 66, 77, 88, 99, 100, 333, 666, 7777};
        int target = 66;
        System.out.println(lowerBound(arr, target));
        System.out.println(higherBound(arr, target));
    }
}
