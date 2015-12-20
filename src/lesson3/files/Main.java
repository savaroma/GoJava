package lesson3.files;

public class Main {
    public static void main(String[] args) {

        // Роман. Коменты на английском это я понимаю. Но для тебя пока пишу на русском.
        // Или сразу пытаться на английском писать?
        // File rootDir = new Directory(); - если я так сделаю, то нужно конструкторы переписывать
        // из директории, что касается рута

        Directory rootDir = new Directory();//Так как и директория и все файлы наследуются от File и там есть все их методы, то можно
        rootDir.showDir();// применять полиморфизм. Типа так File rootDir = new Directory();

        TextFile dontReadme = new TextFile("DO_NOT_READ_ME", rootDir);
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



    }
}
