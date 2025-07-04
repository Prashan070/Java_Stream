package JavaStreamPractice.JavaStream;

import java.util.stream.Stream;

public class CovertBackToArray {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry");

        String[] array = stream.toArray(String[]::new);

    }
}
