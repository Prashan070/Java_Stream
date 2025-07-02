package JavaStreamPractice.JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        IntStream newARR = Arrays.stream(arr);

        Integer[] ar = {1, 2, 3, 4, 5, 6};
        Stream<Integer> st = Stream.of(ar);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 56);
        list.stream();


    }
}
