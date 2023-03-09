package Daily_Practice;

import java.util.Scanner;

/* solve star pattern:
    *
    * *
    * * *
    * * * *
    * * *
    * *
    *
 */
public class p31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row number: ");
        int n = sc.nextInt();

        for( int i=0; i<n; i++ ){
            for( int j=0; j<i+1; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        for( int i=n-1; i>0; i-- ){
            for( int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
