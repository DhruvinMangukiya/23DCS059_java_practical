import java.util.*;
public class practical_6 {
    public static void main(String args[]) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of days : ");
        n = obj.nextInt();
        practical_6 sc = new practical_6();
        sc.fibo(n);
    }

    void fibo(int days) {

        int arr[] = new int[days];

        if (days > 1) {
            arr[0] = 0;
            arr[1] = 1;
        }
        for (int i = 2; i < days; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < days; i++) {
            System.out.println("Day : " + (i + 1) + " Routine time : " + arr[i] +          " minutes");
        }
    }
}
