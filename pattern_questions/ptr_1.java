package Daily_Practice.pattern_questions;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;


public class ptr_1 {
    // 1. Solid rectangle:
    /*
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    static void pattern1(int row, int column){
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // 2. Hollow Pattern:
    /*
        * * * * *
        *       *
        *       *
        * * * * *
     */

    static void pattern2(int row, int column){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++){
                if( i==1 || j==1 || i==row || j==column ){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    // 3. Half pyramid:
    /*
        *
        * *
        * * *
        * * * *
        * * * * *
     */

    static void pattern3(int row, int col){
        for( int i=0; i<row; i++ ){
            for(int j=0; j<i+1; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // 4. Inverted half pyramid:
    /*
        * * * * *
        * * * *
        * * *
        * *
        *
     */

    static void pattern4(int row, int column){
        for(int i=row; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // 5. Inverted half pyramid (rotated by 180b degree):
    /*
                 *
               * *
             * * *
           * * * *
         * * * * *
     */

    static void pattern5(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num-i; j++){
                System.out.print("   ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    // 6. Print the numbers:
    /*
        1
        1 2
        1 2 3
        1 2 3 4
     */
    static void pattern6(int num){
        for (int i=1; i<=num; i++){
            for(int j=1; j<i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // 7. print the number pattern:
    /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
     */
    static void pattern7(int num){
        for(int i = num; i>0; i--){
            for(int j=1; j<=i; j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // 8. Floyd's triangle:
    /*
        1
        2 3
        4 5 6
        7 8 9 10
     */
    static void pattern8(int num){
        int number = 1;
        for (int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }

    // 9.
    /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
     */
    static void pattern9(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();

        pattern1(r,c);
        pattern2(r,c);
        pattern3(r,c);
        pattern4(r,c);

        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        pattern5(n);

        int num = 5;
        pattern6(num);
        pattern7(num);
        pattern8(num);
        pattern9(num);

    }
}
