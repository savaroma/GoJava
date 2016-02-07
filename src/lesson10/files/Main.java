//Реализовать сохранение/загрузку текстового сообщения в файл с предварительным шифрованием/расшифрованием.
//Предусмотреть обработку различных ошибок ввода/вывода.

package lesson10.files;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Directory rootDir = new Directory();
        ArrayList<String> text = new ArrayList<>();

        rootDir.setRootDir(rootDir);

        rootDir.addFile(new TextFile("install", "Это контент файла"));

        rootDir.getDirectoryInfo();

        System.out.println();

        String contentForEncrypt = rootDir.getFileContent(0);
        text.add("Content for encrypting by Cesar method (en-ru): " + contentForEncrypt);

        CryptCesar cesar = new CryptCesar();

        String encryptedFile = cesar.encrypt(contentForEncrypt, 7);
        text.add("Encrypted content by Cesar method (en-ru): " + encryptedFile);

        String decryptedContent = cesar.decrypt(encryptedFile, 7);
        text.add("Content after decryption by Cesar method (en-ru): " + decryptedContent);

        contentForEncrypt = rootDir.getFileName(0);
        text.add("Content for encrypting by Enigma method (only english): " + contentForEncrypt);

        CesarMyRealization cesar2 = new CesarMyRealization();

        encryptedFile = cesar2.encrypt(contentForEncrypt);
        text.add("Encrypted content by Enigma method (only english): " + encryptedFile);

        decryptedContent = cesar2.decrypt(encryptedFile);
        text.add("Content after decryption by Enigma method (only english): " + decryptedContent);
        ArrayList<String> readText = FileInputOutput.readFromFile("readme.txt");
        // при попытке чтения из файла возникает ошибка
        //Error: File not found: readme.txt (Не удается найти указанный файл)

        FileInputOutput.writeToFile("readme.txt", text);



        readText.forEach(System.out::println);


    }

}
