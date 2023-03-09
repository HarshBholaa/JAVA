package Daily_Practice;

import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {
//      18. Java Program to Display Fibonacci Series.

        int first_num = 0;
        int second_num = 1;
        int fib;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(first_num+" ");

            fib = first_num + second_num;
            first_num = second_num;
            second_num = fib;

        }
    }
}
