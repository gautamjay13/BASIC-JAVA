

import java.util.Scanner;

public class palindrome {
   
    public static void main(String[] args) {
        
     {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int original = x ;
       int r = 0 ; 
        while (x!=0) {
            int lastdigit = x % 10 ;
            r= r* 10 ;
            r += lastdigit ;
             x/=10 ;
        }
        if(r==original){
            System.out.println("hello");
        }
        else 
        System.out.println("hi");
    }

    }
}
