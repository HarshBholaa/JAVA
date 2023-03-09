package Daily_Practice;

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
//      19. Java Program to Find GCD( greatest common divisor) or HCF( highest common factor) of two Numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        int gcd = 1;
        for(int i=1; i<=n1 && i<=n2; i++){
            if( n1%i==0 && n2%i==0 ){
                gcd = i; /* It will show what is the greatest common divisor between the two numbers
                         it wil not show how many common factor! */
            }
        }
        System.out.println("gcd of " + n1 +" and " + n2 + " is " +gcd);
    }
}
