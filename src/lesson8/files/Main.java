package lesson8.files;

public class Main {
    public static void main(String[] args) {

        Directory rootDir = new Directory();
        rootDir.showDir();

        rootDir.addFile(new TextFile("dontReadme"));

        Directory musicDir = new Directory("Music");
        rootDir.addFile(musicDir);

        musicDir.addFile(new AudioFile("sonata-5", musicDir, 1024000, true));

        Directory textDir = new Directory("TextFolder", rootDir);
        textDir.addFile(new TextFile("readme", musicDir));

        Directory picturesDir = new Directory("Pictures", rootDir);
        picturesDir.showDir();

        TextFile readmeFirst = new TextFile("readmeFirst", picturesDir);
        readmeFirst.fileInfo();

        Directory documents = new Directory("Documents", rootDir);
        documents.showDir();

        TextFile install = new TextFile("install", "Это контент файла", documents, 100);
        install.fileInfo();
        rootDir.dir();
        System.out.println();

        rootDir.dirSortedByName();
        System.out.println();

        musicDir.dir();
        System.out.println();

        musicDir.dirSortedByName();
        System.out.println();

        picturesDir.dir();
        System.out.println();


    }
}
