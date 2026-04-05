import java.util.Scanner;

public class Q17_smallestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        int c = sc.nextInt() ;
        if (a<b && b<c) {
            System.out.println(a);
        }
        if (b<c && b<a) {
            System.out.println(b);
        }
        if (c<a && c<b) {
            System.out.println(c);
        }
    }
}
