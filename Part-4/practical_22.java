
interface AdvancedArithmetic{
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    int sum = 0;
    public int divisorSum(int n){
        for(int i=1 ; i<=n ; i++){
             if( n % i == 0){
                System.out.println(" "+i);
                sum += i;
             }
        }
        return sum;
    }
}

public class practical_22 {
    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();
       int x;
       x = obj.divisorSum(100);
       System.out.println("Sum = "+x);
    }
}
