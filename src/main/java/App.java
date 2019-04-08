import java.util.Scanner;

import static CaesarCipher.Encrypt.encrypt;


public class App {


//    public static void displayMenu(){
//
//        JTextField decodeField = new JTextField(20);
//
//        JTextField encodeField = new JTextField(20);
//
//        JButton letters = new JButton("Display the alphabet");
//        JButton exit = new JButton("Exit the program");
//
//        JPanel myPanel = new JPanel();
//        myPanel.add(new JLabel("Decode a message:"));
//
//        myPanel.add(decodeField);
//        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
//        myPanel.add(new JLabel("Encode a message:"));
//
//        myPanel.add(encodeField);
//        myPanel.add(letters);
//
//        myPanel.add(exit);
//
//        int result = JOptionPane.showConfirmDialog(null, myPanel,
//
//                "", JOptionPane.OK_CANCEL_OPTION);
//
//        if (result == JOptionPane.OK_OPTION) {
//
//
//        }
//      displayMenu();
//    }


    public static void main(String[] args) {





        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to  Ceaser Cipher program *^-^*  Do you want to encrypt or decrypt?");
        String choice = myScanner.nextLine();

        if (choice.equalsIgnoreCase("encrypt")) {
            System.out.println("Enter text to encrypt");
            String words = myScanner.nextLine();
            System.out.println("Enter shift key");
            int key = myScanner.nextInt();
            StringBuilder encryptedStory = (encrypt(words, key));
            System.out.println("Here is your Encrpted story");
            System.out.println(encryptedStory);
            System.out.println("-------------------------------------------");
        } else if (choice.equalsIgnoreCase("decrypt")) {
            System.out.println("Enter text to decrypt");
            String decryptionText = myScanner.nextLine();
            System.out.println("Enter shift key");
            int key = myScanner.nextInt();
            CaesarCipher.Decrypt ceaserCipher = new CaesarCipher.Decrypt();
            StringBuilder decryptedText = ceaserCipher.decrypt(decryptionText, key);
            System.out.println("Check out your deciphered text below:");
            System.out.println(decryptedText);
            System.out.println("-------------------------------------------");
        } else {
            System.out.println("invalid choice, please choose encrypt or decrypt");
        }
    }
}
