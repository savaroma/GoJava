package lesson9.files;

public class Main {
    public static void main(String[] args) {
        Directory rootDir = new Directory();

        rootDir.setRootDir(rootDir);

        rootDir.addFile(new TextFile("install", "Это контент файла"));

        rootDir.getDirectoryInfo();

        System.out.println();

        String contentForEncrypt = rootDir.getFileContent(0);
        System.out.println("Content for encrypting by Cesar method (en-ru): " + contentForEncrypt);

        CryptCesar cesar = new CryptCesar();

        String encryptedFile = cesar.encrypt(contentForEncrypt, 10);
        System.out.println("Encrypted content by Cesar method (en-ru): " + encryptedFile);

        String decryptedContent = cesar.decrypt(encryptedFile, 10);
        System.out.println("Content after decryption by Cesar method (en-ru): " + decryptedContent);

        contentForEncrypt = rootDir.getFileName(0);
        System.out.println("Content for encrypting by Enigma method (only english): " + contentForEncrypt);

        CesarMyRealization cesar2 = new CesarMyRealization();

        encryptedFile = cesar2.encrypt(contentForEncrypt);
        System.out.println("Encrypted content by Enigma method (only english): " + encryptedFile);

        decryptedContent = cesar2.decrypt(encryptedFile);
        System.out.println("Content after decryption by Enigma method (only english): " + decryptedContent);
    }
}
