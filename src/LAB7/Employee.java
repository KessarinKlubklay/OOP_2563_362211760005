package LAB7;

public class Employee {
    private String name;
    private int age;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public void displayData() {
        System.out.println("Employee Name:" + this.name);
        System.out.println("Employee age:" + this.age);
        System.out.println("Employee position:" + this.position);
        System.out.println("Employee salary:" + this.salary);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}