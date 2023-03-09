package Daily_Practice;

import java.util.Scanner;

public class p26 {
    public static void main(String[] args) {
//     26. Java Program to Check Whether a Number is Prime or Not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int m = num/2;
        int flag = 0;
        for(int i=2; i<=m; i++){
            if( num%i==0 ){
                flag = 1;
                break;
            }
        }
        if( flag==0 ){
            System.out.println("This is prime number: ");
        }
        else{
            System.out.println("This is not a prime number: ");
        }
    }
}
