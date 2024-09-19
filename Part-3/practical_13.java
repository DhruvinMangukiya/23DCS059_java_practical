import java.util.*;

public class practical_13 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.setData();
        emp1.getData();
        emp1.yearlySalary();
        emp1.salaryRaise();
        System.out.println();
        emp2.setData();
        emp2.getData();
        emp2.yearlySalary();
        emp2.salaryRaise();
    }
}

class Employee {
    String First_Name, Last_Name;
    double salary;
    double yearly, raise;
    Scanner sc = new Scanner(System.in);

    Employee() {
        First_Name = "NULL";
        Last_Name = "NULL";
        salary = 0;
    }

    void setData() {
        System.out.print("Enter First name of employee : ");
        First_Name = sc.nextLine();
        System.out.print("Enter Last name of employee : ");
        Last_Name = sc.nextLine();
        System.out.print("Enter Monthly Salary of employee : ");
        salary = sc.nextDouble();
        if (salary < 0) {
            salary = 0.0;
        }
    }

    void getData() {
        System.out.println("Name : " + First_Name + " " + Last_Name);
        System.out.println("Monthly Salary : " + salary);
    }

    void yearlySalary() {
        yearly = salary * 12;
        System.out.println("The yearly Salary of " + First_Name + " is : " + yearly);
    }

    void salaryRaise() {
        raise = yearly * 0.1;
        System.out.println("Yearly Salary after increamnet : " + (yearly + raise));
    }
}