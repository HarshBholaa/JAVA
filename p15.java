package Daily_Practice;

import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
//     15. Java Program to Find Factorial of a Number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int fac = 1;
        for(int i=1; i<=num; i++){
            fac = fac * i;
        }
        System.out.println("The factorial is: "+fac);
    }
}
