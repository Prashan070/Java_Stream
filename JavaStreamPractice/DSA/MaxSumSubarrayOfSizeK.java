package JavaStreamPractice.DSA;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {

        int[] arr={2,5,1,8,2,9,1};

        //subarray
        //min//max
        //of size k
        int size=3;
        int sum=0;
        int i=0;
        int j=0;
        int maxSum=0;
      while(j<arr.length){
            sum=sum+arr[j];
            if(j-i+1<size){
             j++;
            }
        else   if(j-i+1==size){
              maxSum=Math.max(maxSum,sum);
              sum=sum-arr[i];
              i++;
              j++;
          }
        }
        System.out.println(maxSum);
    }
}
