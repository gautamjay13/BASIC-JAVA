import java.util.Scanner;

public class Q18_profitandloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt() ;
        int sp = sc.nextInt() ;
        if (sp>cp) {
            System.out.println("profit");
        }
        else if (cp>sp){
            System.out.println("loss");
        }
        else {
            System.out.println("no profit");
        }

    }
}
