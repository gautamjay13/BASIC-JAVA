import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        System.out.println("enter your nnumber");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int sum =0 ;
        int r = 0 ; 
        while (n!=0) {
             int lastdigit = n % 10 ; 
              
              r += lastdigit ;
              n = n / 10 ;
      
        
    }
    System.out.println("Sum of digits: " + r);
}
}
