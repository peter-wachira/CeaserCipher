

import java.util.Scanner;

import static CaesarCipher.Encrypt.encrypt;


public class App
{
    String Ciphered;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your story");
        String text = myScanner.nextLine();
        System.out.println("Enter your private key");
        int s = myScanner.nextInt();

        System.out.println("Encrypted text is " + encrypt(text, s));




    }
}
