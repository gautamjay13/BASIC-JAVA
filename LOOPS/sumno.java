

import java.util.Scanner;

public class sumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int r = 0 ; 
        while (n!=0) {
            int lastdigit = n % 10 ;
            r= r* 10 ;
            r += lastdigit ;
             n/=10 ;
        }
        System.out.println(r);

    }
}
