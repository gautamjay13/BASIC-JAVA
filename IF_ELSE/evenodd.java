package IF_ELSE;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        if (n % 2 == 0) {
            System.out.println("your number is even :" + n);

        }
        else{
            System.out.println("your number is odd :" + n);
        }
    }
}
