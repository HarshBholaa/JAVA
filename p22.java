package Daily_Practice;

import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
//      22. Java Program to Reverse a Number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int rev = 0;
        while( num!=0 ){
          int digit = num%10;
//          rev = rev*10 + digit;
          System.out.print(digit);
          num = num/10;
        }
    }
}
