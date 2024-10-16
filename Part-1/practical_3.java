import java.util.*;

public class practical_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float meters, seconds, hours, minuts;

        System.out.print("Enter your distance in meters : ");
        meters = sc.nextFloat();

        System.out.print("Enter your hours : ");
        hours = sc.nextFloat();

        System.out.print("Enter your minuts : ");
        minuts = sc.nextFloat();

        System.out.print("Enter your second  : ");
        seconds = sc.nextFloat();

        System.out.println("speed in meters per second :" + (meters / (seconds + (minuts * 60) + (hours * 3600))));
        System.out.println("speed in kilometers per hour :" + (meters / ((hours + (seconds / 3600) + (minuts / 60)) * 1000)));
        System.out.println("speed in miles per hour :" + (meters / ((hours + (seconds / 3600) + (minuts / 60)) * 1609)));
    }
}
