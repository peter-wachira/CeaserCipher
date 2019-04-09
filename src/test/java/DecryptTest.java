
package CaesarCipher;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class DecryptTest{

    @Test
    public void encrypt_testLetterEncryption_String(){
        Decrypt testDecrypt = new Decrypt();
        String expectedOutput  = "H";
        assertEquals(expectedOutput, testDecrypt.decrypt("I", 1));
    }
    @Test
    public void encrypt_testWordEncryption_String(){
        Decrypt testDecrypt = new Decrypt();
        String expectedOutput  = "peter";
        assertEquals(expectedOutput, testDecrypt.decrypt("qfufs", 1));
    }
    @Test
    public void encrypt_testLetterCase_String(){
        Decrypt testDecrypt = new Decrypt();
        String expectedOutput  = "HellO";
        assertEquals(expectedOutput, testDecrypt.decrypt("IfmmP", 1));
    }
    @Test
    public void encrypt_testSentenceEncryption_String(){
        Decrypt testDecrypt = new Decrypt();
        String expectedOutput  = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals(expectedOutput, testDecrypt.decrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 23));
    }
    @Test
    public void encrypt_testOtherCharacterEncryption_String(){
        Decrypt testDecrypt = new Decrypt();
        String expectedOutput  = "cde3!";
        assertEquals(expectedOutput, testDecrypt.decrypt("def3!", 1));
    }

}