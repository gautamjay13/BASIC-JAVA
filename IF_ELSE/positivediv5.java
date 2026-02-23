package IF_ELSE;
import java.util.Scanner;

public class positivediv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt() ;
        if (x%5==0) {
            System.out.println("the number is divided by 5 : " + x);
        }
        else{
            System.out.println("the number is not divided by 5 :"+ x);
        }
    }
}
