package Daily_Practice;

// 27. Write a program to print the multiplication table in reverse order also.

import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you number: ");
        int num = sc.nextInt();

//        for(int i=1; i<=10; i++ ){
//            System.out.println(num+" X "+i+" = "+num*i);
//        }
        for(int i=10; i>=1; i-- ){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
