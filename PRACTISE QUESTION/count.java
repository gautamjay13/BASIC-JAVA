import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int even = 0 , odd = 0  ;
        while (n!= 0) {
            int ld =  n % 10 ; 
            if (ld%2==0){
                even++ ;
            }
            else{
                odd++ ;
            }
            n = n / 10 ;
        }
        System.out.println("even : " + even);
        System.out.println("odd : " + odd);
    }
}
