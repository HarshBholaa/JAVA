package Daily_Practice;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
//      11. Java Program to Check Leap Year.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year: ");
        int year = sc.nextInt();

        if( year%400==0 || year%4==0 ){
            System.out.println("This is leap year!");
        }
        else if ( year % 100==0 ) {
            System.out.println("this is not leap year: ");
        }
        else{
            System.out.println("This is not a leap year!");
        }
    }
}
