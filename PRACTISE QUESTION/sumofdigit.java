import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        System.out.println("enter your nnumber");
        Scanner sc = new Scanner(System.in);
        int sum =0 ; 
        int n = sc.nextInt() ;
        for (int i = 0; i < n; i++) {
          int last_digit = n % 10 ;
         
        sum = sum + last_digit ;  
        }
        int last_digit = n % 10 ;
        
        
        System.out.println(sum);
    }
}
