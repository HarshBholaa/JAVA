package Daily_Practice;

import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
//      14. Java Program to Calculate the Sum of Natural Numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you enter: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("The sum of natural numbers is: "+sum);
    }
}
