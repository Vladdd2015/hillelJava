
import java.util.Scanner;
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {


        //tryToGuess();

        telegramCost();

        luckyTicket();


        bankOperation();



    }

    public static void bankOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your deposit ");
        double deposit = scanner.nextDouble();
        System.out.print("Enter month number ");
        int month = scanner.nextInt();
        double persent = 0.03;
        int col = 0;
        for (int i=1;i<=month;i++){
            deposit +=deposit * (persent/12);
        }
        System.out.println(deposit);
        System.out.println("Enter a deposit what you want to get ");
        int max = scanner.nextInt();
        while(deposit<=max){
            deposit +=deposit * persent;
            col++;
        }
        System.out.println("You need to wait " + col + " years before your deposit will be " + max);
    }

    public static void luckyTicket() {
        int luckyTickets = 0;
        for (int i = 1001; i < 1000000; i++) {
            int i1 = i / 100000 % 10,
                    i2 = i / 10000 % 10,
                    i3 = i / 1000 % 10,
                    i4 = i / 100 % 10,
                    i5 = i / 10 % 10,
                    i6 = i % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                luckyTickets++;
            }
        }
        System.out.println("There is " + luckyTickets + " lucky tickets");
    }





    public static void telegramCost() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message ");
        String message = scanner.nextLine();
        String[] words = message.split(" ");
        System.out.print("One word cost ");
        int cost = scanner.nextInt();


        for (int i = 1; i < words.length; i++) {
            cost++;
        }

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
            } else if (guess > 1000) {
                System.out.println("Your number is wrong");
            } else if (guess < numberToGuess) {
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