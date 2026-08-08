import java.util.*;
public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a :");
        float a = sc.nextFloat();
        System.out.println("enter a operator:");
        char ch = sc.next().charAt(0);
        System.out.println("enter b:");
        float b = sc.nextFloat();
        switch (ch) {
            case '+' :
            System.out.println("sum:"+(a+b));
            break;
            case '-':
            System.out.println("subtraction:"+(a-b));
            break;
            case '*':
            System.out.println("multiplication:"+(a*b));
            break;
            case '/':
            System.out.println("division:"+(a/b));
            break;
            default:
            System.out.println("invalid input!");
        
        }       
    }
    
}
