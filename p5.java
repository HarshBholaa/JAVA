package Daily_Practice;

public class p5 {
    public static void main(String[] args) {
//      5. Java Program to Find ASCII Value of a character.
        char ch;

        for(ch ='a'; ch>='a' && ch<='z'; ch++){
            int value = ch;
            System.out.println("The ASCII value of "+ch+" is: "+value);
        }
    }
}
