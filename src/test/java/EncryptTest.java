package CaesarCipher;

import org.junit.*;


import static junit.framework.TestCase.assertEquals;

public class EncryptTest{

    @Test
    public void encrypt_testLetterEncryption_String(){
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput  = "I";
        assertEquals(expectedOutput, testEncrypt.encrypt("H", 1));
    }
    @Test
    public void encrypt_testWordEncryption_String(){
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput  = "qfufs";
        assertEquals(expectedOutput, testEncrypt.encrypt("peter", 1));
    }
    @Test
    public void encrypt_testLetterCase_String(){
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput  = "IfmmP";
        assertEquals(expectedOutput, testEncrypt.encrypt("HellO", 1));
    }
    @Test
    public void encrypt_testSentenceEncryption_String(){
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput  = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        assertEquals(expectedOutput, testEncrypt.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));
    }
    @Test
    public void encrypt_testOtherCharacterEncryption_String(){
        Encrypt testEncrypt = new Encrypt();
        String expectedOutput  = "def3!";
        assertEquals(expectedOutput, testEncrypt.encrypt("cde3!", 1));
    }

}