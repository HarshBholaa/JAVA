package Daily_Practice;

import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
//      20. Java Program to Find LCM of two Numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        int gcd = 1;
        int lcm;
        for(int i=1; i<=n1 && i<=n2; i++){
            if( n1%i==0 && n2%i==0 ){
                gcd = i;
            }
        }
        System.out.println("GCD is: "+gcd);
        lcm = (n1 * n2)/gcd;
        System.out.println("Lcm is: "+lcm);
    }
}
