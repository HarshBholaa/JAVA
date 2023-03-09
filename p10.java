package Daily_Practice;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
//      10. Java Program to Find the Largest Among Three Numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int n3 = sc.nextInt();

        if( n1>n2 && n1>n3 ){
            System.out.println("n1 is greater number!");
        }
        else if ( n2>n3 ){
            System.out.println("n2 is greater number!");
        }
        else{
            System.out.println("n3 is greater number!");
        }
    }
}
