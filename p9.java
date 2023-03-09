package Daily_Practice;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
//      9. Java Program to Swap Two Numbers Without using third variable.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("The value of num1 and num2 before swapping: "+num1+" "+num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("The value of num1 and num2 after swapping: "+num1+" "+num2);
    }
}
