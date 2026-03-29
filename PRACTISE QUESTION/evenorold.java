import java.util.Scanner;

public class evenorold {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        if (n%2==0) {
            System.out.println("your number is even");
        }
        else{
            System.out.println("your number is odd");
        }
    }
}
