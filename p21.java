package Daily_Practice;

import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
//      21. Java Program to Count Number of Digits in an Integer.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int count = 0;
        while( num!=0 ){
            num = num/10;
            count++;
        }
        System.out.println("Total digits is: "+count);
    }
}
