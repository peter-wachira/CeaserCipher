

import java.util.Scanner;

import static CaesarCipher.Decrypt.decrypt;
import static CaesarCipher.Encrypt.encrypt;


public class App
{

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your story");
        String words = myScanner.nextLine();
        System.out.println("Enter your private key");
        int key = myScanner.nextInt();

        StringBuilder encryptedStory = (encrypt( words, key));
        System.out.println("Here is your Encrpted story");
        System.out.println(encryptedStory);

        StringBuilder decryptedText;
        decryptedText = (decrypt(encryptedStory.toString(), key));
        System.out.println("Here is your decrypted story");
        System.out.println(decryptedText);
    }
}