public class SpecialNumber {
    public static void main(String[] args) {
        int m=11;
        int n = 30;
        for(int num=m;num<=n;num++){
            int i = num%10;           
            int j = num/10;
            int sum=i+j;
            int product=i*j;
            if((sum+product)==num){
                System.out.print(num+ " ");
            }
        }
    }
}
    
