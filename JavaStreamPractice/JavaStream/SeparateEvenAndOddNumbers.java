package JavaStreamPractice.JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEvenAndOddNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);





        Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println(result);

        Map<String, List<Integer>> result1 = numbers.stream().collect(Collectors.groupingBy(n->n%2==0?"even":"odd"));
        System.out.println(result1);


        // Map<String,List<Integer>> result = numbers.stream().map()

    }
}
