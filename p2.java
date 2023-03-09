package Daily_Practice;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
//        2. Java Program to Add Two Integers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of a and b is: "+sum);
    }
}
