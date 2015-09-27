import java.util.Scanner;

/**
 * Created by Влад on 24.09.2015.
 */
public class HomeWork {
    public static void main(String[] args) {
        evenOddNumbers();
        System.out.println("\n");
        closeNumber();
        System.out.println("\n");
        rectangle();


    }

    private static void evenOddNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your integer number: ");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd ");

        }
    }

    private static void closeNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int number2 = scanner.nextInt();

        int constantNumber = 10;
        int result1 = constantNumber - number1;

        if (result1 > 0) {
            result1 = result1;
        } else {
            result1 = Math.abs(result1);
        }


        int result2 = constantNumber - number2;

        if (result2 > 0) {
            result2 = result2;
        } else {
            result2 = Math.abs(result2);
        }


        if (result1 < result2) {
            System.out.println("First number is the nearest to 10 ");
        } else if (result1 == result2) {
            System.out.println("First and second numbers are near 10");
        } else {
            System.out.println("Second number is the nearest to 10");
        }

    }

    private static void rectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter perimeter of your rectangle(in cm) : ");
        double perimetr = scanner.nextInt();

        System.out.print("Enter area of your rectangle(in cm) : ");
        double area = scanner.nextInt();

        double summ = perimetr / 2;


        double discriminant = (summ * summ) - (4 * area);
        if (discriminant > 0) {
            double lenth = ((summ + Math.sqrt(discriminant)) / 2);
            double height = ((summ - Math.sqrt(discriminant)) / 2);
            System.out.println("Rectange lehth is " + lenth + " centimeters");
            System.out.println("Rectange height is " + height + " centimeters");
        } else {
            System.out.println("Rectangle doesnt exist ");
        }


    }


}
