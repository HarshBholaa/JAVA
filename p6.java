package Daily_Practice;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
//     6. Java Program to Compute Quotient and Remainder.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of dividend: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of divisor: ");
        int b = sc.nextInt();

        int Remainder = a % b;
        double quotient = a / b;
        System.out.println("The remainder is: "+Remainder);
        System.out.println("The quotient is: "+quotient);

    }
}
