import java.util.Scanner;

public class Q20_simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;
        int sum  = n + m ; 
        int sub  =  n - m ; 
        int mul = n *m  ; 
        int div = n/ m ; 

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
