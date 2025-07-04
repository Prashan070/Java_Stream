package JavaStreamPractice.JavaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumberList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int result = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(()->new RuntimeException("not found"));
        System.out.println(result);
    }
}
