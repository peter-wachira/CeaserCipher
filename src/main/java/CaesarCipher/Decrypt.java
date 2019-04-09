package CaesarCipher;


public class Decrypt {

    public static String decrypt(String encryptedStory, int key)
    {
        String decryptedText= "";
        String errorMessage ="";

        if (key<1 || key > 26) {
        errorMessage = "key must be between 1 to 25";
        }else {
            for (int i = 0; i < encryptedStory.length(); i++) {
                if (Character.isUpperCase(encryptedStory.charAt(i))) {
                    char ch = (char) (((int) encryptedStory.charAt(i) -
                            key));
                    if (ch < 'A') {
                        decryptedText += ((char) (encryptedStory.charAt(i) + (26 - key)));
                    } else {
                        decryptedText += (ch);
                    }
                } else if (Character.isLowerCase(encryptedStory.charAt(i))) {
                    char ch = (char) (((int) encryptedStory.charAt(i) -
                            key));
                    if (ch < 'a') {
                        decryptedText += ((char) (encryptedStory.charAt(i) + (26 - key)));
                    } else {
                        decryptedText += (ch);
                    }

                } else {

                    char ch = encryptedStory.charAt(i);

                    decryptedText += (ch);
                }

            }
            return decryptedText;
        }
        return errorMessage;
    }

}



