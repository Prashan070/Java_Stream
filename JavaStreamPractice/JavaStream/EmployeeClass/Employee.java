package JavaStreamPractice.JavaStream.EmployeeClass;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;
    private String gender;


    public Employee(int id, String name, int age, String department, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
    }


    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return name + " (" + department + ", " + gender + ", " + age + ", ₹" + salary + ")";
    }
}

