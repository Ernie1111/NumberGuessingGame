
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Generates random Number
        int number = (int) (Math.random() * 11);

        //User input and question for user to guess number
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 10");
        int numGuess = input.nextInt();

        //If statements to provide you answers for your response
        if (number == numGuess) {
            System.out.println("Correct the number was " + number);

        } else if (number > numGuess) {
            System.out.print("The number you guessed is to low :(");

        } else if (numGuess > number) {
            System.out.print("The number you guessed is to high :(");

        }
    }
}
