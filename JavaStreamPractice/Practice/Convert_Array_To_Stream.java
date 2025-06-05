package JavaStreamPractice.Practice;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Convert_Array_To_Stream {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        IntStream numstr = Arrays.stream(nums);

        Integer[] nums2 = {1, 2, 3, 4, 5};

        Stream<Integer> st = Stream.of(nums2);


    }
}
