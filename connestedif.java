public class connestedif {
    public static void main(String[] args) {
        int age = 54;
        if (age>=18){
            System.out.println("Adult");
            if(age>=60) {
                System.out.println("old age");
            }
            else {
                System.out.println("young");
            }
        }
        else
        {
            System.out.println("minor");
            if(age<=10){
                System.out.println("child");
            }

            }
        }  
    }  

    
