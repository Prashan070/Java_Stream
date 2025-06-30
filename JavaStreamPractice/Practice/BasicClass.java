package JavaStreamPractice.Practice;


import java.util.Arrays;

public class BasicClass {
    public static void main(String[] args) {

        //Sallow coping

        int[] arr = {1, 2, 3};
        int[] newArr = arr;

        newArr[2] = 4;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));

        //Deep coping

        int[] prr = {1,2,34};
        //int[] newPrr = prr.clone();
        int[] newPrr = Arrays.copyOf(prr, prr.length);

        newPrr[2]=3;

        System.out.println(Arrays.toString(prr));
        System.out.println(Arrays.toString(newPrr));





    }
}



