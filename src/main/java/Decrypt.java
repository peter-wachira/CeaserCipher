package CaesarCipher;


public class Decrypt {

    public static StringBuilder decrypt(String encryptedStory, int key)
    {
        StringBuilder decryptedText= new StringBuilder();

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
                        key - 65) % 26 + 65);
                if(ch <'A'){
                    decryptedText.append((char)( encryptedStory.charAt(i) +(26-key)));
                } else {
                    decryptedText.append(ch);
                }
            }
            else if(Character.isLowerCase(encryptedStory.charAt(i)))
            {
                char ch = (char)(((int)encryptedStory.charAt(i) -
                        key - 97) % 26 + 97);
                if(ch <'a'){
                    decryptedText.append((char)( encryptedStory.charAt(i) +(26-key)));
                } else {
                    decryptedText.append(ch);
                }

            }
            else {

                char ch = encryptedStory.charAt(i);
                return decryptedText.append(ch);
            }

        }
        return decryptedText;
    }

}



