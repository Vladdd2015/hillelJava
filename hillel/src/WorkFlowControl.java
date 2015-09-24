import java.util.Scanner;

/**
 * Created by NewClass10 on 24.09.2015.
 */
public class WorkFlowControl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
              int age = scanner.nextInt();



        if (age<10){
            System.out.println("kid");
        }else if (age<20){
            System.out.println("teen");
        }else if (age<50){
            System.out.println("adult");
        }else {
            System.out.println("old");
        }

    }

    private static void ifExplanation() {
        boolean condition = true;
        if (condition)
            System.out.println("in IF");

        if (condition){
        System.out.println("out of IF block");
    }
        else{
            System.out.println("in ELSE block");
        }
    }
}
