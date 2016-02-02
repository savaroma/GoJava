package lesson9.files;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CryptCesarTest {
    CryptCesar cesar = new CryptCesar();

    @Test
    public void testEncrypt() throws Exception {
        String string = "Test String";
        string = cesar.encrypt(string, 15);

        Assert.assertEquals("8tHIg7IGxCv", string);
    }

    @Test
    public void testDecrypt() throws Exception {
        String string = "8tHIg7IGxCv";
        string = cesar.decrypt(string, 15);

        Assert.assertEquals("Test String", string);
    }
}