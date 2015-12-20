package lesson3.files;

public class Main {
    public static void main(String[] args) {
//      Объявляем корневую директорию и создам по одной папке разного типа и несколько файлов,
//          которые при создании вызывают разные конструкторы
        Directory rootDir = new Directory();
        rootDir.dirInfo();

        TextFile dontReadme = new TextFile("DO_NOT_READ_ME", rootDir);
        dontReadme.fileInfo();

        Directory musicDir = new Directory("Music", rootDir);
        musicDir.dirInfo();

        AudioFile sheakspeare = new AudioFile("sonata-5", musicDir, 1024000, true);
        sheakspeare.fileInfo();

        TextFile readme = new TextFile("readme", musicDir);
        readme.fileInfo();

        Directory picturesDir = new Directory("Pictures", rootDir);
        picturesDir.dirInfo();

        TextFile readme1 = new TextFile("readme1", picturesDir);
        readme1.fileInfo();

        Directory documents = new Directory("Documents", rootDir);
        documents.dirInfo();

        TextFile install = new TextFile("install", "Это контент файла", documents, 100);
        install.fileInfo();



    }
}
