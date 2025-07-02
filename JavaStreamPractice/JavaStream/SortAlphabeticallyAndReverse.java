package JavaStreamPractice.JavaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAlphabeticallyAndReverse {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        List<String> result = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result);

        List<String> resul2 = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(resul2);

    }
}
