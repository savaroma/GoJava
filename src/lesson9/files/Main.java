package lesson9.files;

public class Main {
    public static void main(String[] args) {
        String contentForEncrypt;
        String encryptedFile;
        String decryptedContent;

        Directory rootDir = new Directory();

        rootDir.addFile(new TextFile("dontReadme"));

        Directory musicDir = new Directory("Music");
        rootDir.addFile(musicDir);

        musicDir.addFile(new AudioFile("sonata-5", musicDir, 1024000, true));

        Directory textDir = new Directory("TextDir");
        rootDir.addFile(textDir);
        textDir.addFile(new TextFile("readme", musicDir));

        Directory picturesDir = new Directory("Pictures");
        rootDir.addFile(picturesDir);

        picturesDir.addFile(new TextFile("readmeThird"));
        picturesDir.addFile(new TextFile("readmeFirst"));
        picturesDir.addFile(new TextFile("readmeSecond"));

        Directory documentsDir = new Directory("Documents");
        textDir.addFile(documentsDir);

        documentsDir.addFile(new TextFile("install", "Это контент файла", 100));

        rootDir.dir();
        System.out.println();

        rootDir.dirSortedByName();
        System.out.println();

        musicDir.dir();
        System.out.println();

        picturesDir.dir();
        System.out.println();

        picturesDir.dirSortedByName();
        System.out.println();

        contentForEncrypt = documentsDir.filesList.get(0).getContent();
        System.out.println(contentForEncrypt);
        CryptCesar cesar = new CryptCesar();
        encryptedFile = cesar.encrypt(contentForEncrypt,1,15);
        System.out.println(encryptedFile);
        decryptedContent = cesar.decrypt(encryptedFile,1,15);
        System.out.println(decryptedContent);
    }
}
