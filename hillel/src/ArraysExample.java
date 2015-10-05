import java.util.Scanner;

/**
 * Created by VPalienko on 01.10.2015.
 */
public class ArraysExample {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i <= 4;i++){
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println("number: " + intArray[i]);
        }

        for(int value : intArray){
            System.out.println("value: " + value);
        }

    }

    public static void arraysInit() {
        int[] array = {1,5,4,6,5};

        int array2[] = {2,5,4,6,8};

        int value = array[2];

        System.out.println(value);

        int[] inputValues = new int[3];

        Scanner scanner = new Scanner(System.in);

        inputValues[0] = scanner.nextInt();
        inputValues[1] = scanner.nextInt();
        inputValues[2] = scanner.nextInt();
        System.out.println("first number: " + inputValues[0]);
        System.out.println("second number: " + inputValues[1]);
        System.out.println("third number: " + inputValues[2]);
    }
}
