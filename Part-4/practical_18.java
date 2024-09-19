public class practical_18 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager man = new Manager();
        emp.insertdata();
        emp.printData();
        man.insertdata();
        man.printData();
    }
}

class Member {
    String name;
    int age;
    long phone_number;
    String address;
    int salary;

    public

            void printSalary() {
        System.out.println("Salary : " + salary);
    }

    void insertdata() {
        name = "Dhruvin";
        age = 18;
        phone_number = 9904964064l;
        address = "42 laxmi wadi soc";
        salary = 15000;
    }

    void printData() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone Number : " + phone_number);
        System.out.println("Address : " + address);
        System.out.println("Salary : " + salary);
    }
}

class Employee extends Member {
    public

    String specialization;
}

class Manager extends Member {
    public

    String department;
}