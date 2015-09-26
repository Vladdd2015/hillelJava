import java.util.Scanner;

/**
 * Created by Âëàä on 24.09.2015.
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

        if (number%2 ==0) {
            System.out.println("Your number is even");
        }
        else {
            System.out.println("Your number is odd ");

        }
    }

    private static void closeNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int number2 = scanner.nextInt();

        int constantNumber = 10;
        int res1 = constantNumber - number1;

        if (res1>0){
            res1 = res1;
        }

        else{
            res1 = res1 *-1;
        }



        int res2 = constantNumber - number2;

        if (res2>0){
            res2 = res2;
        }

        else{
            res2= res2 *-1;
        }



        if (res1<res2){
            System.out.println("First number is the nearest to 10 ");
        }
        else if(res1 == res2){
            System.out.println("First and second numbers are near 10");
        }
        else{
            System.out.println("Second number is the nearest to 10");
        }

    }

    private static void rectangle(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter perimeter of your rectangle : ");
        int number1 = scanner.nextInt();

        System.out.print("Enter area of your rectangle ");
        int number2 = scanner.nextInt();

        int summ = number1/2;


        int b;


        for (b = 1;b<summ;b++){
            if(b*b == summ*b - number2) {

                System.out.println("Rectangle height: " + b);
                System.out.println("Rectangle lenght: " + (summ - b));
                break;
            }
            else{
                System.out.println("rectangle isn't valid ");
                break;
            }




        }



    }


}
