public class practical_5 {

    public static void main(String args[]) {
        int code[] = { 1, 2, 3, 4, 5 };
        float price[] = { 500, 1000, 1500, 2000, 2500 };
        float total = 0;

        for(int i=0;i<5;i++){
            switch(i+1)
            {
                case 1:
                total += price[i] * 0.08 + price[i];
                 break;

                 case 2:
                 total += price[i] * 0.12 + price[i];
                 break;

                 case 3:
                 total += price[i] * 0.05 + price[i];
                 break;

                 case 4:
                 total += price[i] * 0.075 + price[i];
                 break;

                 case 5:
                 total += price[i] * 0.03 + price[i];
                 break;
            }
        }
        System.out.println("The total amount of electronic products is : "+total);
    }
}
