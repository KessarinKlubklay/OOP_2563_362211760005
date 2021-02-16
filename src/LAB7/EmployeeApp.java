package LAB7;

public class EmployeeApp {
    public EmployeeApp() {
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Puriwat Lertkrai", 34, "Teacher", 20000.0D);
        emp1.displayData();
        emp2.displayData();
        emp1.setName("Piyapong Senanut");
        emp1.setAge(37);
        emp1.setPosition("Dean");
        emp1.setSalary(50000.0D);
        emp1.displayData();
        System.out.println("Emp name: " + emp1.getName());
    }
}
