package Daily_Practice;

import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
//      16. Java Program to Generate Multiplication Table.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your table number: ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
