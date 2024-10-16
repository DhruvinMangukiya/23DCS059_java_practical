import java.util.*;

public class practical_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of days : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your day " + (i + 1) + " expenses : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum = arr[i] + sum;
        }

        System.out.print("The sum of the daily expenses : " + sum);
    }
}
