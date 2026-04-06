import java.util.Scanner;

public class Q24_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0 ; 
        int n = sc.nextInt() ; 
        for (int i = 0; i <= n; i++) {
            n = n / 10  ; 
            count ++ ;
        }
        System.out.println(count);
    }
}
