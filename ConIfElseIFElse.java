public class ConIfElseIFElse {
    public static void main(String[] args) {
        int age = 80;
        if(age<=3){
            System.out.println("child");
        }
        else if( age>=4 && age<=12){
            System.out.println("kid");}
        else if(age>=13 && age<=18){
            System.out.println("teenager");}
        else if(age>=19 && age<=60){
            System.out.println("adult");}
        else{
            System.err.println("old age");
        }
        }
   }

