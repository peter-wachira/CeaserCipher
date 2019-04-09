package CaesarCipher;


public class Decrypt {

    public static String decrypt(String encryptedStory, int key)
    {
        String decryptedText= "";

        if (key > 26) {
            key = key % 26;
        } else if (key < 0) {
            key = (key % 26) + 26;
        }

        for (int i=0; i<encryptedStory.length(); i++)
        {
            if (Character.isUpperCase(encryptedStory.charAt(i)))
            {
                char ch = (char)(((int)encryptedStory.charAt(i) -
                        key ));
                if(ch <'A'){
                    decryptedText += ((char)( encryptedStory.charAt(i) +(26-key)));
                } else {
                    decryptedText += (ch);
                }
            }
            else if(Character.isLowerCase(encryptedStory.charAt(i)))
            {
                char ch = (char)(((int)encryptedStory.charAt(i) -
                        key));
                if(ch <'a'){
                    decryptedText += ((char)( encryptedStory.charAt(i) +(26-key)));
                } else {
                    decryptedText += (ch);
                }

            }
            else {

                char ch = encryptedStory.charAt(i);

                decryptedText += (ch);
            }

        }
        return decryptedText;
    }

}



