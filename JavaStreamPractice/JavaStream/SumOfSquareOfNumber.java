package JavaStreamPractice.JavaStream;

import java.util.List;

public class SumOfSquareOfNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);

      int result =   numbers.stream().map(n->n*n).mapToInt(n->n).sum();
        System.out.println(result);


    /*    int result = numbers.stream()
                .mapToInt(n -> n * n)  // Squaring + primitive stream
                .sum();
*/
    }
}
