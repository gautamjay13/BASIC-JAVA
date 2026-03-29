import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int  r = 0 ;
        int n = sc.nextInt() ;
        while (n!=0) {
            int lastdigit = n % 10 ;
             r = r * 10  ;
           r += lastdigit ;
            
            n = n / 10 ;
        }
        System.out.println(r);
    }
}
