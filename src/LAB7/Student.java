package LAB7;

public class Student {
    static String faculty = "MT RUTS";
    String name;
    int age;
    String major;

    public Student() {
    }

    public void introduce() {
        System.out.println("My name is " + this.name);
        System.out.println("I am " + this.age + " years old.");
        System.out.println("I studying in " + this.major);
        System.out.println("My faculty: " + faculty);
    }

    public void changeFaculty(String newfac) {
        faculty = newfac;
    }
}
