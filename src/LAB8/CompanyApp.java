package LAB8;

import LAB7.Car;

import java.util.ArrayList;
import java.util.Scanner;

import static LAB7.CarApp2.displayObject;

public class CompanyApp {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.setPid("123456789");
        emp1.setName("kessarin klubklay");
        emp1.setAge(22);
        emp1.setGender("feMale");
        emp1.setTel("0808943639");

        emp1.setEmpID("emp001");
        emp1.setPosition("Programmer");
        emp1.setSalary(30000.00);

        //display Object data
        System.out.println(emp1.toString());

        ArrayList<Employee>myEmp= new ArrayList<Employee>();
        for (int i = 0; i < 3; i++){
            //input data to Object
            System.out.println("Please,enter car info"+(i+1)+": ");
            Employee c = inputDataObject();
            myEmp.add(c);
        }
        displayObject(myEmp);
    }//main

    private static Employee inputDataObject() {
        Scanner c = new Scanner(System.in);

        return ;
    }
}
}
