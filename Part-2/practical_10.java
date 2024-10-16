import java.util.*;
public class practical_10 {

    public static void main(String[] args) {
        String str = "HelloWorld";
        int n = str.length();
        StringBuffer obj = new StringBuffer(str);
        System.out.println("length of the string : "+n);
        System.out.println("Lowercase of the String : "+str.toLowerCase());
        System.out.println("Uppercase of the String : "+str.toUpperCase());
        System.out.println("Reverse String : "+obj.reverse());
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String sortarr = new String(arr);
        System.out.println("Sort the string : "+sortarr);
    }
}
