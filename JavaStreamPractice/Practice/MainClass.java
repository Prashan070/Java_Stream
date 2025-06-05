package JavaStreamPractice.Practice;

import java.util.*;
import java.util.stream.Stream;

public class MainClass {


    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Prashan", 2000));
        emp.add(new Employee("Amit", 2500));
        emp.add(new Employee("Sneha", 2200));
        emp.add(new Employee("Raj", 2700));
        emp.add(new Employee("Neha", 2300));
        emp.add(new Employee("Karan", 2100));
        emp.add(new Employee("Divya", 2600));

        //salary greater than 2500

        List<Employee> result = emp.stream().filter(n->n.getSalary()>2500).toList();
        result.forEach(System.out::println);

        //only salary
        double[] result1 = emp.stream().filter(n->n.getSalary()>2500).mapToDouble(e->e.getSalary()).toArray();

        System.out.println(Arrays.toString(result1));

        //count
        Long result2 = emp.stream().filter(n->n.getSalary()>2500).count();
        System.out.println(result2);

        //natural sorting
        Integer[] ls = { 1,22,6,3,888};
        Stream<Integer> result4 = Stream.of(ls).sorted();
        result4.forEach(System.out::println);


        //sorted //custom sorting
        List<Employee> result3 = emp.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        result3.forEach(System.out::println);

        System.out.println("***************");

        Comparator<Employee> s1 = Comparator.comparing(Employee::getName);
        List<Employee> result5 = emp.stream().sorted(s1).toList();
        result5.forEach(System.out::println);

        Double maxSal = emp.stream().max(Comparator.comparing(Employee::getSalary)).map(Employee::getSalary).orElse(0.0);
        System.out.println(maxSal);



        //emp with max salary
        //emp with second max slary
        //count slary less than 2500

        String maxEmp  = emp.stream().max(Comparator.comparingDouble(Employee::getSalary)).map(Employee::getName).orElse("non");
        System.out.println(maxEmp);


        Optional<Employee> secondMaxEmp  = emp.stream().sorted(((o1, o2) -> (int) (o2.getSalary()- o1.getSalary()))).skip(1).findFirst();
        secondMaxEmp.ifPresent(System.out::println);



    }
}
