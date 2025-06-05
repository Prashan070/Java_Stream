package JavaStreamPractice.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TraditionalWay {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(33);
        list.add(22);
        list.add(11);
        list.add(7);
        list.add(7);
        list.add(1);
        list.add(10);

        //Filter
        List<Integer> result = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        result.forEach(System.out::println);

        System.out.println("                               ");

        //Map
        List<Integer> result2 = list.stream().map(n->n*2).toList();
        result2.forEach(System.out::println);




    }
}
