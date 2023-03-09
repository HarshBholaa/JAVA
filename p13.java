package Daily_Practice;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
//      13. Java Program to Find all Roots of a Quadratic Equation( AX^2 + BX + c = 0 ).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();
        double D = b*b-4*a*c;
        System.out.println("determinent is: "+D);

        double root1;
        double root2;

        if( D>0 ){
            root1 = (-b + Math.sqrt(D))/2*a;
            root2 = (-b - Math.sqrt(D))/2*a;
            System.out.println("root1 = "+root1);
            System.out.println("root2 = "+root2);
        }
        else if( D==0 ){
             root1 = -b/2.0f*a;
             System.out.println("root1 = root2 is: "+root1);
        }
        else{
                // roots are complex number and distinct
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-D) / (2 * a);
                System.out.format("root1 = %.2f+%.2fi", real, imaginary);
                System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
            }
        }
    }

