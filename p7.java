package Daily_Practice;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
//      7. Java Program to Check Whether a Number is Even or Odd.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextByte();

        if( num%2==0 ){
            System.out.println("This is even number.");
        }
        else{
            System.out.println("This is odd number.");
        }
    }
}
