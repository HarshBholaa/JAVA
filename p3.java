package Daily_Practice;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
//        3. write a program to find sum of three integers numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        int sum = a+b+c;
        System.out.println("the sum of three number is: "+sum);


    }
}
