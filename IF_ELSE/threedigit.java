package IF_ELSE;

import java.util.Scanner;

public class threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        if (n>99 && n<=999) {
            System.out.println("the number is three digit : " + n);
        }
        else if (n<100) {
            System.out.println("the number is smaller than 100 :" + n);

        }
        else
        {
            System.out.println("the number is greater than 1000 :" + n);
        }
    }
}
