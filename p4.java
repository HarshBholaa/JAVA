package Daily_Practice;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
//    4. Java Program to Multiply two Floating Point Numbers.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first decimal number: ");
        float n1 = sc.nextFloat();
        System.out.print("Enter second decimal number: ");
        float n2 = sc.nextFloat();
        float product = n1 * n2;
        System.out.println("The product is:"+product);

    }
}
