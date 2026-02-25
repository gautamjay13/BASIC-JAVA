package IF_ELSE;

import java.util.Scanner;

public class nested3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        if (n%5==0 || n%3 == 0) {
            if (n%15!=0) {
                System.out.println("the number is divided by 3 and 5 but not divided by 15");
            }
            else{
                System.out.println("invalid condition");
            }
        }
        else{
                System.out.println("invalid condition");
            }
    }
}
