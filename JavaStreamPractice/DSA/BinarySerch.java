package JavaStreamPractice.DSA;

public class BinarySerch {

    public static int binarySerchMethod(int[] arr, int target) {

        int i = 0;
        int j= arr.length-1;

        while (i<=j){
            int mid = i +(j-i)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 44, 55, 66, 77, 88, 99, 100, 333, 666, 7777};
        int target = 66;

        System.out.println(BinarySerch.binarySerchMethod(arr, target));

    }
}
