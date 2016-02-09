package lesson9.files;

import org.junit.Assert;
import org.junit.Test;

public class CesarMyRealizationTest {
    CesarMyRealization cesarTest = new CesarMyRealization();


    @Test(timeout = 3000)
    public void testEncrypt() throws Exception {
        String string = "Test String";
        string = cesarTest.encrypt(string);

        Assert.assertEquals("Hkxh Xhjden", string);
    }

    @Test(timeout = 3000)
    public void testDecrypt() throws Exception {
        String string = "Hkxh Xhjden";
        string = cesarTest.decrypt(string);

        Assert.assertEquals("Test String", string);

    }
}