package JavaStreamPractice.JavaStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapEx {
    public static void main(String[] args) {

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );







        List<Integer> result = nestedList.stream().flatMap(Collection::stream).toList();
        System.out.println(result);

    }
}
