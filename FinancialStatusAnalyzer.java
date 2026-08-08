import java.util.*;
public class FinancialStatusAnalyzer {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("profit");
        }else if (num<0){
            System.out.println("loss");
        }else{
            System.out.println("no profit or no loss");
        }
    }
}
