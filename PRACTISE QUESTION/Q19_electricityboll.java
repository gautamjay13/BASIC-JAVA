import java.util.Scanner;

public class Q19_electricityboll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int bill =  0 ;
        if (n>0 && n<=100) {
         bill = n * 5 ;
        }
        else if (n>100 && n<200) {
            bill = 100 * 5 + n * 7 ;        
        }
        else {
            bill = 100 * 5 + 200 * 7 + n * 10  ;

        }
        System.out.println(bill);
    }
}
