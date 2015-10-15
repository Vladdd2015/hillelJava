package cryptedFiles;

import java.util.Scanner;


public class Crypt {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message and key ");
       Scrambler scrambler = new Scrambler(scanner.nextLine(),scanner.nextLine());
        System.out.println("Crypted message " + scrambler.crypt());
        System.out.println("Decrypted message " + scrambler.crypt());



    }



}

