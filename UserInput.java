import java.util.Scanner;
class UserInput {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = inp.nextLine();
        System.out.println("Enter your department:");
        String department = inp.nextLine();
        System.out.println("Enter your CGPA:");
        float CGPA = inp.nextFloat();
        System.out.println("Enter your register Number:");
        long register_number = inp.nextLong();
        System.out.println("Enter your phone number:");
        long phone_number = inp.nextLong();
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + register_number);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + CGPA);
        System.out.println("Phone Number: " + phone_number);
    }
}