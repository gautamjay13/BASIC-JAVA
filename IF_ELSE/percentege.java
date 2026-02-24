package IF_ELSE;

import java.util.Scanner;

public class percentege {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage (0-100): ");
        double percentage = sc.nextDouble();

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Grade: Excellent");
        } 
        else if (percentage >= 80) {
            System.out.println("Grade: Very Good");
        } 
        else if (percentage >= 70) {
            System.out.println("Grade: Good");
        } 
        else if (percentage >= 60) {
            System.out.println("Grade: Can do better");
        } 
        else if (percentage >= 50) {
            System.out.println("Grade: Average");
        } 
        else if (percentage >= 40) {
            System.out.println("Grade: Below Average");
        } 
        else if (percentage >= 0) {
            System.out.println("Grade: Fail");
        } 
        else {
            System.out.println("Invalid percentage!");
        }

        sc.close();
    }
}