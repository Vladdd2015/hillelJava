/**
 * Created by NewClass10 on 21.09.2015.
 */
public class DataTypes {
    public static void main(String[] args) {
        int age = 31;

        int days = age * 365;

        int hours = days * 24;

        int seconds = hours * 3600;

        long milliseconds = seconds * 1000L;

        seconds = (int) (milliseconds / 1000);

        System.out.println(milliseconds);

        double d = 3.54;
        int i = 10;
        long l = 100;
        long lO = 5000000000L;
        float f = 2.54F;

        boolean bool = true;
        bool = false;//нельзя присваивать ничего кроме булевых переменных

        String s = "Hello, world!";

        char c = 'h';

        byte b = 125;
    }
}
