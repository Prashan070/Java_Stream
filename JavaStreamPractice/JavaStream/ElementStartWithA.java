package JavaStreamPractice.JavaStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ElementStartWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex");
        //List<String> result = names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
          List<String> result = names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);
    }
}
