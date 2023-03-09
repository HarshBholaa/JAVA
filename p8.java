package Daily_Practice;

import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
//      8. Java Program to Check Whether an Alphabet is Vowel or Consonant.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character: ");
        char ch = sc.next().charAt(0);

        if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("This is vowel!");
        }
        else if ( ch>='a' && ch<='z' ) {
            System.out.println("This is an Alphabet.");
        }
        else{
            System.out.println("This is constant.");
        }
    }
}
