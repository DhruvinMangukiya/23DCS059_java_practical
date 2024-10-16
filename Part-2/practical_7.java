import java.util.*;
public class practical_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter Your String : ");
        str = sc.next();

        System.out.print("Enter the number of time you want to repeat the first three character in your string : ");
        int n;
        n = sc.nextInt();
        String newstr = repetFrontString(str, n);
        System.out.print("New String Is : "  + newstr);
    }

    static String repetFrontString(String string,int x){
            String newstr = "";

            for(int i=0 ; i<x ; i++){
                if(string.length() <= x){
                    newstr += string;
                }
                else{
                    newstr += string.substring(0,3);
                }
            }
        return newstr;
    }
}
