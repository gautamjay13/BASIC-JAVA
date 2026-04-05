import java.util.Scanner;

public class Q6_largenumbers {
    public static void main(String[] args) {
        int n , m ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt() ;
        m = sc.nextInt() ;
        if (n>m) {
            System.out.println(n);
        }
        if (m>n) {
            System.out.println(m);
        }
    }
}
