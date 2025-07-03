package JavaStreamPractice.JavaStream;

import java.util.Arrays;
import java.util.List;

public class filterEvenAndSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 7, 3, 4, 20, 5);

        List<Integer> result = numbers.stream().filter(n -> n % 2 == 0).toList();






        result.forEach(System.out::println);

     /*   int sum = numbers.stream().filter(n->n%2==0).mapToInt(n->n).sum();
        System.out.println(sum);

*/


        int sum2 = numbers.stream().filter(n->n%2==0).reduce(0,(a,b)->a+b);
        System.out.println(sum2);

        int sum=numbers.stream().filter(n->n%2==0).mapToInt(n->n).sum();
        System.out.println(sum);


    }
}

