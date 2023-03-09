package Daily_Practice;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
//      12. Java Program to Check Whether a Number is Positive or Negative.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        if( num>0 ){
            System.out.println("your number is positive!");
        }
        else if( num<0 ){
            System.out.println("your number is negative!");
        }
        else if( num==0 ){
            System.out.println("Your number is equal to zero!");

        }
    }
}
