package JavaStreamPractice.DSA;

public class CeilAndFloor {

    public static int ceil(int[] arr, int target) {
        int i=0;
        int j= arr.length-1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]>target){
               ans=mid;
               j=mid-1;
            }else {
                i=mid+ 1;
            }
        }
        return ans;
    }

    public static int floor(int[] arr, int target) {
        int i=0;
        int j= arr.length-1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]<=target){
                ans=mid;
                i=mid+1;
            }else {
                j=mid-1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 6;


        System.out.println(CeilAndFloor.ceil(arr, target));
        System.out.println(CeilAndFloor.floor(arr, target));
    }
}
