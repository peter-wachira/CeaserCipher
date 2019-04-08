package CaesarCipher;



public class Encrypt {



    public static StringBuilder encrypt(String text, int s)

    {

        StringBuilder result= new StringBuilder();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                if(ch >'Z'){
                    result.append((char)( text.charAt(i) -(26-s)));
                } else {
                    result.append(ch);
                }

            }
            else if( Character.isLowerCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);

                if(ch >'z'){
                    result.append((char)( text.charAt(i) -(26-s)));
                } else {
                    result.append(ch);
                }

            }
            else{

                char ch = text.charAt(i);
                result.append(ch);

            }
        }
        return result;


    }

}
