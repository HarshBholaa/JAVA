package Daily_Practice;

import java.util.Scanner;

public class p23 {
    public static void main(String[] args) {
//      23. Java Program to Calculate the Power of a Number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your base: ");
        int base = sc.nextInt();
        System.out.println("Enter your exponent: ");
        int exp = sc.nextInt();
        int pow = 1;
        while( exp!=0 ){
            pow = pow * base;
            exp--;
        }
        System.out.println("The power is: "+pow);
    }
}
