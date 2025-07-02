package JavaStreamPractice.DSA;

import java.util.Arrays;

public class MoveZeroOneSide {
    public static void main(String[] args) {


        int[] arr = {0, 1, 0, 3, 12};

        int j=0;

        for(int i=0; i<arr.length ; i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int k=j ; k<=arr.length-1; k++){
            arr[k]=0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
