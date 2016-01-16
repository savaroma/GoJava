package lesson6.files;

public class Main {
    public static int MAX_FILE_SIZE = 1000;
    public static void main(String[] args) {

        Directory rootDir = new Directory();
        rootDir.showDir();

        TextFile dontReadme = new TextFile("dontReadme", rootDir);
        dontReadme.fileInfo();

        Directory musicDir = new Directory("Music", rootDir);
        musicDir.showDir();

        AudioFile shakespeare = new AudioFile("sonata-5", musicDir, 1024000, true);
        shakespeare.fileInfo();

        TextFile readme = new TextFile("readme", musicDir);
        readme.fileInfo();

        Directory picturesDir = new Directory("Pictures", rootDir);
        picturesDir.showDir();

        TextFile readmeFirst = new TextFile("readmeFirst", picturesDir);
        readmeFirst.fileInfo();

        Directory documents = new Directory("Documents", rootDir);
        documents.showDir();

        TextFile install = new TextFile("install", "Это контент файла", documents, 100);
        install.fileInfo();

        try {
            if (shakespeare.getSize() > 1000) {
                throw new FileSizeException(shakespeare);
            }
        } catch (FileSizeException e) {
            System.out.println("[Error]: File Size is too big. Max file size is " + MAX_FILE_SIZE);
        }

    }
}
