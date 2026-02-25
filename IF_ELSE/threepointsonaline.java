package IF_ELSE;

import java.util.Scanner;

public class threepointsonaline {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1 =1 ;
    int y1 =1 ;
    int x2 =2 ;
    int y2 =2 ;
    int x3 =3;
    int y3 = 3;

    double m1 = (y2 - y1) / (x2-x1) ;
    double m2 = (y3 - y2) / (x3-x2) ;
    if (m1==m2) {
        System.out.println("these points are in straight line");
    }
   } 
}
