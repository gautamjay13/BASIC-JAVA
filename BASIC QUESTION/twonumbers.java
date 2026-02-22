
import java.util.*;
public class twonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one");
        int a = sc.nextInt() ;
        System.out.println("enter number second");
        int b = sc.nextInt() ;

        int sum = a + b ;
        int diff = a - b ;
        int prod = a*b ; 
        int div = a/b ;
        int mod = a % b ; 

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(div);
        System.out.println(mod);
        


    }
}
