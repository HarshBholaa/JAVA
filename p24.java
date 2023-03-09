package Daily_Practice;

import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
//       24. Java Program to Check Palindrome.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while( num!=0 ){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        if( original == reverse ){
            System.out.println("This is palindrome!");
        }
        else{
            System.out.println("This is not a palindrome!");
        }
    }
}
