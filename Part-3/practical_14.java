import java.util.*;

public class practical_14 {
    public static void main(String args[]) {
        Date date = new Date();
        date.displayDate();
        date.setData();
        date.displayDate();
    }
}

class Date {
    int month, day, year;
    Scanner sc = new Scanner(System.in);

    Date() {
        month = 3;
        day = 23;
        year = 2006;
        System.out.print("The Date using constructor is : ");
    }

    void setData() {
        System.out.print("Enter your day :");
        day = sc.nextInt();
        System.out.print("Enter your month :");
        month = sc.nextInt();
        System.out.print("Enter your year :");
        year = sc.nextInt();
        System.out.print("The Date using setData is : ");
    }

    void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}