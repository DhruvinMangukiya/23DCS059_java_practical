public class practical_11 {
    public static void main(String args[]){
        String str = "CHARUSAT UNIVERSITY";
        int n = str.length();
        System.out.println("length of the string : "+n);
        StringBuffer sc = new StringBuffer(str);
        sc.setCharAt( 1, 'D' );
        System.out.println(sc.toString());
        System.out.println("Lowercase of the String : "+str.toLowerCase());
    }
}
