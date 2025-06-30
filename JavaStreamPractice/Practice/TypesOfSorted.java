package JavaStreamPractice.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TypesOfSorted {
    public static void main(String[] args) {
        //ARRAYS SORTED

        int[] arr = {12, 1, 4, 22, 6, 40, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        //COLLECTION SORTED

       // List<Integer> list = List.of(100,12, 1, 4, 22, 6, 40, 5);
        List<Integer> list = Arrays.asList(100,12, 1, 4, 22, 6, 40, 5);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
