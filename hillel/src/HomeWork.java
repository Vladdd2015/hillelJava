import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("If you want to use Math calc,enter 1");
        System.out.println("If you want to use trunk and fract calc,enter 2");
        System.out.print("Please,enter your choise: ");
        int num1 = 1;
        num1 = scan.nextInt();
        if (num1 == 1) {
            calc();
        } else {
            trunkFract();
        }


    }

    public static void calc() {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter first number: ");
        double number1 = scan.nextDouble();

        System.out.print("Choose your operation: ");
        char operation = scan.next().charAt(0);

        System.out.print("Enter second number: ");
        double number2 = scan.nextDouble();

        double result = 0;

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Division is not possible ");
                    break;
                } else
                    result = number1 / number2;
                break;


            default:
                System.out.println("You have entered a wrong operation ");
                break;

        }
        if ((int)Math.round(result)!=result){
            System.out.println("Result = " + result + "(double)");

        }
        else if(result >= -127 && result <= 128){
            System.out.println("Result = " + result + "(byte)");
        }
        else if(result >=-32768 && result <=32767){
            System.out.println("Result = " + result + "(short)");
        }
        else if(result >=-2147483648 && result <=2147483647 ){
            System.out.println("Result = " + result + "(int)");
        }
        else{
            System.out.println("Result = " + result + "(long)");
        }



    }

    public static void trunkFract() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");

        double number = scanner.nextDouble();


        System.out.print("Choose your operation(t or f): ");

        char op = scanner.next().charAt(0);
        double result = 0;
        switch (op) {
            case 't':
                int a;
                a = (int) number;
                result = a;

                break;
            case 'f':
                int res = (int) number; //целая часть
                double res2 = number - res;
                result = res2;

                break;
        }

        System.out.println("Result = " + result);
    }

}