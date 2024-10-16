import java.util.*;
public class practical_8 {
    public static void main(String args[]){

        int arr[] = new int[3];
        int count =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Element : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i]  == 9)
            {
                count++;
            }
        }
        System.out.print("The number of 9's in the array is : "+count);
    }
}
