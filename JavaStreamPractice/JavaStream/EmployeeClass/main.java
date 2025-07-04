package JavaStreamPractice.JavaStream.EmployeeClass;

import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 30, "HR", 50000, "Female"),
                new Employee(2, "Bob", 28, "IT", 60000, "Male"),
                new Employee(3, "Charlie", 35, "IT", 70000, "Male"),
                new Employee(4, "Diana", 40, "Finance", 80000, "Female"),
                new Employee(5, "Eve", 25, "HR", 45000, "Female"),
                new Employee(6, "Frank", 45, "Finance", 75000, "Male"),
                new Employee(7, "Grace", 32, "IT", 72000, "Female")
        );

        //Group employees by department


        Map<String, List<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(result);

        //Count employees in each department

        Map<String, Long> result1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(result1);

        // Find the highest-paid employee

        Employee result2 = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();

        //Find the average salary per department


        Map<String, Double> result3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        //Partition employees by gender




        Map<String, List<Employee>> result4 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(result4);

        //Get names of all employees in a comma-separated string


        String names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));

        //Get the second-highest salaried employee
       Employee result5= employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();

    }
}
