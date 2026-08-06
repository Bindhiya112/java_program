import java.util.Scanner;
public class PrintfloatAndavg {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num 1:");
        float num1 = sc.nextFloat();
        System.out.println("enter the num2:");
        float num2 = sc.nextFloat();
        float avg = (num1+num2)/2;
        System.out.printf("avg: %.2f",avg);
    }    
}
