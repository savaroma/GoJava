package lesson10.files;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static lesson10.files.FileInputOutput.readFromFile;

public class FileInputOutputTest {

    @Test
    public void testReadWriteToFile() throws Exception {
        ArrayList<String> text = new ArrayList<>();
        text.add("testWrite1");
        text.add("testWrite2");

        FileInputOutput.writeToFile("readmeTestWriteToFile.txt", text); //не логично записывать в один файл, а потом
        //проверять запись из другого файла. Этот тест не понятно, что тестирует?

        Assert.assertArrayEquals(text.toArray(), readFromFile("readmeTestWriteToFileEthalone.txt").toArray());

    }
}