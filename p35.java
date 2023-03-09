package Daily_Practice;

import java.util.Scanner;

// 35. Write a program to print fibonacci series 1 to n.

public class p35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        int c;
        for( int i=2; i<n; i++ ){

            c = a + b;
            System.out.print(" "+c+" ");

            a = b;
            b = c;

        }
    }
}
