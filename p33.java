package Daily_Practice;

import java.util.Random;
import java.util.Scanner;

class game{

    int number;
    int userInput;
    int noOfGuesses = 0;

    public void setNoOfGuesses(int no_of_guesses){
        this.noOfGuesses = no_of_guesses;
    }

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

     public void takeUserInput(){
         noOfGuesses++;
         Scanner sc = new Scanner(System.in);
         userInput = sc.nextInt();
     }

     public void isCorrectNumber(){
         if( userInput==number ){
             System.out.println("Yes, this is a correct number..."+userInput);
             return;
         }
         else if( userInput<number ){
             System.out.println("Enter greater number...");
         }
         else if( userInput>number ){
             System.out.println("Enter lower number...");
         }
     }

    game(){
        Random obj = new Random();
        this.number = obj.nextInt(100);
    }
}
public class p33 {
    public static void main(String[] args) {
//        Create a class Game, which allows a user to play "Guess the Number" game once.
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!
        game g = new game();
        boolean b = false;
        while( !b ){
            g.takeUserInput();
            g.isCorrectNumber();
        }
        System.out.println(g.getNoOfGuesses());
    }
}
