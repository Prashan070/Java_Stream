package JavaStreamPractice.BasicLogic;

import java.util.function.Function;

public class FunctionalDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> ls = i ->i*i;

        System.out.println(ls.apply(5));



    }

}
