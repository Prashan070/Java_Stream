package JavaStreamPractice.DSA;

public class FindTheMinimumInSortedArray {

    public static int smallNumber(){
        int[] arr =  {3,4,5,1,2};
        int i=0;
        int j=arr.length-1;
        if(arr[i]<=arr[j]){return arr[i];}

        while (i<=j){
            int mid= i+(j-i)/2;
            if(mid>0 && arr[mid]<arr[mid-1]){
                return arr[mid];
            }else if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return  arr[mid+1];
            }
            if (arr[mid] >= arr[i]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FindTheMinimumInSortedArray.smallNumber());
    }
}
