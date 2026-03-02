package LOOPS;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for (int i = 1; i <=(3*n-7); i+=3) {
           System.out.println(i);
        }
    }
}
