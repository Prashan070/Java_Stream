package JavaStreamPractice.DSA;


public class RemoveElemnent {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

       int i=0;
        int j=0;
        for(int k=0; k<arr.length; k++){
            if(arr[k] != val){
               arr[i]=arr[k];
               i++;
            }

        }
        System.out.println(i);
    }
}

//0-