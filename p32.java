package Daily_Practice;

// 32. Game rock, paper and scissor:

import java.util.Scanner;
import java.util.Random;
public class p32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 for rock;
        // 1 for paper;
        // 2 for scissor;

        System.out.println("Enter 0 for rock, 1 for paper and 2 for scissor!");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput==computerInput){
            System.out.println("Draw!");
        }

        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }
        // System.out.println("Computer choice: " + computerInput);
        if(computerInput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerInput==2){
            System.out.println("Computer choice: Scissors");
        }
    }
}
