import java.util.Scanner;

public class Q15_gradesystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt() ; 
        if (marks>=90) {
          System.out.println("A");

        }
        if (marks>=75 && marks<=89) {
           System.out.println("b"); 
        }
        if (marks>=60 && marks<=74 ) {
           System.out.println("c"); 
        }
        if (marks>=40 && marks<=59 ) {
           System.out.println("d"); 
        }
        if (marks<=40) {
           System.out.println("fail"); 
        }


    }
}
