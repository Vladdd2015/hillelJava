import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {


        //tryToGuess();

        //telegramCost();
       /* public static String crypt(String message, char key)
        {
            char[] chars = message.toCharArray();

        }*/
    }

    public static void telegramCost() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message ");
        String message = scanner.nextLine();
        String[] words = message.split(" ");
        System.out.print("One word cost ");
        int cost = scanner.nextInt();
        int i;

        for ( i = 1; i<= words.length;i++){

        }
        cost *=i;
        System.out.println("You need to pay " + cost + " money for your message");
    }

    public static void tryToGuess() {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(1000);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        boolean win = false;
        System.out.println("- Try to guessed number from 1 to 1000");

        while (win == false) {

            System.out.print("Enter your number:");
            int guess = input.nextInt();

            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            }
            else if(guess>1000){
                System.out.println("Your number is wrong");
            }
            else if (guess < numberToGuess) {
                System.out.println("- Your number is low ");
            } else if (guess > numberToGuess) {
                System.out.println("- Your number is high");
            }
        }
        System.out.println("My congratilation! You are winner!!!");
        System.out.println("The number is: " + numberToGuess);

        System.out.println("Number of tries: " + numberOfTries);
    }
}