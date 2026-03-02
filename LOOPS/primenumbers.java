package LOOPS;

import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        boolean flag = false ;
        for (int i = 2; i < n ; i++) {
            if (n%i==0) {
                    flag = true ;
                break ;
            }
        }
        if (n==1) {
            System.out.println("non");
        }
        if (flag==false) {
            System.out.println("prime numbers");
        }
        else{
            System.out.println("composite numbers");
        }

    }
}
