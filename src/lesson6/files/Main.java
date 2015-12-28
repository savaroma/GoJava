package lesson6.files;

public class Main {
    public static void main(String[] args) {

        Directory rootDir = new Directory();
        rootDir.showDir();

        TextFile dontReadme = new TextFile("dontReadme", rootDir);
        dontReadme.fileInfo();

        Directory musicDir = new Directory("Music", rootDir);
        musicDir.showDir();

        AudioFile sheakspeare = new AudioFile("sonata-5", musicDir, 1024000, true);
        sheakspeare.fileInfo();

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
            if (sheakspeare.getSize() > 1000) {
                throw new FileSizeException(sheakspeare.getSize());
            }
        } catch (FileSizeException e) {
            System.out.println("[Error]: File Size is too big. Mix file size is 1000 ");
        }

    }
}
