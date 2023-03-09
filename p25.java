package Daily_Practice;

import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
//      25. Java Program to Make a Simple Calculator Using switch...case.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter your character: ");
        char operator = sc.next().charAt(0);
        int result;

        switch (operator){
            case '+':
                result = n1 + n2;
                System.out.println(n1+" + "+n2+" = "+result);
                break;

            case '-':
                result = n1 - n2;
                System.out.println(n1+" - "+n2+" = "+result);
                break;

            case '*':
                result = n1 * n2;
                System.out.println(n1+" * "+n2+" = "+result);
                break;

            case '/':
                result = n1 / n2;
                System.out.println(n1+" / "+n2+" = "+result);
                break;
            default:
                System.out.println("Invalid input operator!");
        }
    }
}
