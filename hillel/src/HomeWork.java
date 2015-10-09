
import java.util.Scanner;


public class HomeWork {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        System.out.print("Enter your key: ");
        char key = scanner.next().charAt(0);
        String res = crypt(message, key);
        System.out.println("Crypted message: " + res);
        String res2 = crypt(res,key);
        System.out.println("Decrypted message: " + res2);


    }

    public static String crypt(String message, char key) {
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= key;
        }


        message = String.copyValueOf(chars);

        return message;


    }
}


