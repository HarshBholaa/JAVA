package Daily_Practice.pattern_questions;

// Star patter advanced questions:

import java.util.Scanner;

public class ptr_2 {
    // 1. Butterfly star pattern:
    /*

        *         *
        * *     * *
        * * * * * *
        * * * * * *
        * *     * *
        *         *

     */

    // 2. Solid Rhombus star pattern:
    /*
           * * * * *
         * * * * *
       * * * * *
     * * * * *
   * * * * *
                 */

    static void pattern_2(int num){

        for( int i=1; i<=num; i++ ){
            int spaces = num-i;
            for( int j=1; j<=spaces; j++ ){
                System.out.print("  ");
            }
            for ( int k = 1; k<=num; k++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // 3. Full pyramid in number pattern:
    /*
              1
            2 1 2
          3 2 1 2 3
        4 3 2 1 2 3 4
      5 4 3 2 1 2 3 4 5
                          */

    static void pattern_3(int num){
        for( int i=1; i<=num; i++ ){
            int space = num-i;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            // 1 half:

           for(int k=i; k>=1; k--){
               System.out.print(k+" ");
           }
           // 2nd half:

            for( int j=2; j<=i; j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // 4. Diamond star pattern:
    /*
              *
            * * *
          * * * * *
        * * * * * * *
          * * * * *
            * * *
              *
     */

    static void pattern_4(int num){
        for( int i=1; i<=num; i++ ){
            int space = num-i;
            for( int j=1; j<=space; j++ ){
                System.out.print("   ");
            }
            //  upper half....
            for( int k=1; k<=i; k++ ){
                System.out.print(" * ");
            }
            for( int j=2; j<=i; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
        // lower half.....
        for( int i=num-1; i>=1; i-- ){
            int space = num-i;
            for( int j=1; j<=space; j++ ){
                System.out.print("   ");
            }
            //  upper half....
            for( int k=1; k<=i; k++ ){
                System.out.print(" * ");
            }
            for( int j=2; j<=i; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.
        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        // upper half
//        for( int i=1; i <= n; i++ ){
//            // left half
//            for( int j=1; j<=i; j++ ){
//                System.out.print(" * ");
//            }
//            // spaces
//            int space = 2*(n-i); // 2*(5-1) = 8 spaces
//            for( int k=1; k<=space; k++ ){
//                System.out.print("   ");
//            }
//            // right half:
//            for( int j=1; j<=i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        // lower half
//        for( int i=n; i > 0 ; i-- ){
//            // left half
//            for( int j=1; j<=i; j++ ){
//                System.out.print(" * ");
//            }
//            // spaces
//            int space = 2*(n-i); // 2*(5-1) = 8 spaces
//            for( int k=1; k<=space; k++ ){
//                System.out.print("   ");
//            }
//            // right half:
//            for( int j=1; j<=i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 2.
//        pattern_2(n);
//        pattern_3(n);
        pattern_4(n);

    }
}
