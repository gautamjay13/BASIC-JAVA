import java.util.Scanner;

public class Q10_passandfaiil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt() ;
        if (marks>=40) {
            System.out.println("you are pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
