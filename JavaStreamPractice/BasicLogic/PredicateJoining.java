/*
package JavaStreamPractice.BasicLogic;


import JavaStreamPractice.Practice.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class EmployeeT {

    private int empId;
    private String empName;
    private String empDepartment;
    private double salary;
    private int age;
    private boolean isActive;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public EmployeeT(int empId, String empName, String empDepartment, double salary, int age, boolean isActive) {
        this.empId = empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.salary = salary;
        this.age = age;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", isActive=" + isActive +
                '}' + '\n';
    }
}


public class PredicateJoining {


    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        empList.add(new JavaStreamPractice.BasicLogic.Employee(1, "Alice", "HR", 45000, 28, true));
        empList.add(new JavaStreamPractice.BasicLogic.Employee(2, "Bob", "IT", 75000, 32, true));
        empList.add(new JavaStreamPractice.BasicLogic.Employee(3, "Charlie", "Finance", 65000, 45, false));
        empList.add(new JavaStreamPractice.BasicLogic.Employee(4, "David", "IT", 82000, 29, true));
        empList.add(new JavaStreamPractice.BasicLogic.Employee(5, "Eve", "HR", 47000, 25, false));
        empList.add(new JavaStreamPractice.BasicLogic.Employee(6, "Frank", "Finance", 60000, 38, true));
        empList.add(new JavaStreamPractice.BasicLogic.Employee(7, "Grace", "IT", 92000, 41, true));
        empList.add(new JavaStreamPractice.BasicLogic.Employee(8, "Hannah", "Marketing", 53000, 31, false));
        empList.add(new JavaStreamPractice.BasicLogic.Employee(9, "Ivan", "Marketing", 51000, 27, true));
        empList.add(new JavaStreamPractice.BasicLogic.Employee(10, "Judy", "Finance", 67000, 35, true));


        //And //OR //Negate

        Predicate<Employee> highestSal = emp -> emp.getSalary()>50000;
        Predicate<Employee> ageFactor = emp -> emp.getAge()>40;

        List<Employee> ls = empList.stream().filter(highestSal.and(ageFactor)).toList();
        System.out.println(ls);
    }


}
*/
