package CaesarCipher;

import java.util.Scanner;

import static CaesarCipher.Encrypt.encrypt;


public class App {


    public static void main(String[] args) {





        Scanner myScanner = new Scanner(System.in);
        System.out.println("╔╦═╦╦═╦╗╔═╦═╦═╦═╦═╗╔╗▒▒▒\n" +
                "║║║║║╦╣║║╔╣║║║║║║╦╝║╚╦═╗\n" +
                "║║║║║╩╣╚╣╚╣║║║║║║╩╗║╔╣╬║\n" +
                "╚═╩═╩═╩═╩═╩═╩╩═╩╩═╝╚═╩═╝\n"+"╔═╗░░░░╔═╗░░░░╔═╦╗░╔╗░░░░░\n" +
                "║╔╬═╦═╗║═╬═╦╦╗║╔╬╬═╣╚╦═╦╦╗\n" +
                "║╚╣╩╣╬╚╬═║╩╣╔╝║╚╣║╬║║║╩╣╔╝\n" +
                "╚═╩═╩══╩═╩═╩╝░╚═╩╣╔╩╩╩═╩╝░\n" +
                "░░░░░░░░░░░░░░░░░╚╝░░░░░░░\n");
        System.out.println("");
        System.out.println("Welcome to  Ceaser Cipher program *^-^*  Do you want to encrypt or decrypt?");
        String choice = myScanner.nextLine();

        if (choice.equalsIgnoreCase("encrypt")) {
            System.out.println("Enter text to encrypt");
            String words = myScanner.nextLine();
            System.out.println("Enter shift key");
            int key = myScanner.nextInt();
            String encryptedStory = (encrypt(words, key));
            System.out.println("Here is your Encrpted story");
            System.out.println(encryptedStory);
            System.out.println("-------------------------------------------");
        } else if (choice.equalsIgnoreCase("decrypt")) {
            System.out.println("Enter text to decrypt");
            String decryptionText = myScanner.nextLine();
            System.out.println("Enter shift key");
            int key = myScanner.nextInt();
            CaesarCipher.Decrypt ceaserCipher = new CaesarCipher.Decrypt();
            String decryptedText = ceaserCipher.decrypt(decryptionText, key);
            System.out.println("Check out your deciphered text below:");
            System.out.println(decryptedText);
            System.out.println("-------------------------------------------");
        } else {
            System.out.println("invalid choice, please choose encrypt or decrypt");
        }
    }
}
