package Daily_Practice;

// 28. Write a program to print all prime numbers between given two intervals.

import java.util.Scanner;

public class p28 {

    static int is_prime(int n){
        for(int i=2; i*i <= n; i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            if(is_prime(i) == 1){
                System.out.println(i+" ");
            }
        }
    }
}
