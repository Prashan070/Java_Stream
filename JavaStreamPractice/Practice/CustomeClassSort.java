package JavaStreamPractice.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    long salary;
    int age;

    public Employee(String name, long salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}' + '\n';
    }


/*    @Override
    public int compareTo(Employee o) {
        return this.age - o.age;
    }
    */

}

public class CustomeClassSort {
    public static void main(String[] args) {
        List<Employee> e1 = new ArrayList<>();
        e1.add(new Employee("Alice", 8500, 20));
        e1.add(new Employee("Bob", 9200, 20));
        e1.add(new Employee("Char", 7000, 18));
        e1.add(new Employee("Alice", 7500, 20));
        e1.add(new Employee("David", 8000, 18));

       /* e1.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)
                .thenComparing(Comparator.comparing(Employee::getSalary).reversed()));

*/
        e1.sort(Comparator.comparing( (Employee o1) ->o1.name.length()).thenComparing(Employee::getAge));


        e1.forEach(System.out::println);


    }
}
