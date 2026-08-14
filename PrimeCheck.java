public class PrimeCheck {
    public static void main(String[] args) {
        int num = 1;
        boolean isPrime = true;
        for (int i =2; i<= num-1; i++){
            if(num%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    
}
