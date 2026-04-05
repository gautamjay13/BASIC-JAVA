import java.util.Scanner;

public class Q5_positiveandnegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ; 
        if(n==0){
            System.out.println("zero");
        }
        else if(n<0){
            System.out.println("the number is negative");
        }
        else{
System.out.println("the number is postive");
        }
        }
    }

