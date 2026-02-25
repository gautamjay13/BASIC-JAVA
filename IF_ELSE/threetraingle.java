package IF_ELSE;

import java.util.Scanner;

public class threetraingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int a = sc.nextInt() ;
        System.out.println("enter your second number");
        int b = sc.nextInt() ;
        System.out.println("enter your third number");
        int c = sc.nextInt() ;
        if (a+b >c && b+c >a && a+c>b) {
           System.out.println("these are the sides od triangle"); 
        }
        else{
            System.out.println("Invlaid sides");
        }
    }
}