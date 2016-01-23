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
            if (shakespeare.getSize() > MAX_FILE_SIZE) {
                throw new FileSizeException(shakespeare);
            }
        } catch (FileSizeException e) {
            System.out.println("[Error]: File Size is too big. Max file size is " + MAX_FILE_SIZE);
        }

    }
}
//
//        [1:25:51] Савинюк Р.В.: Оль у меня в 3 уроке есть антипаттерн якорь
// (неиспользуемые классы) Aster, Bouquet, Chamomille, RoseBush, Tulip. Согласно заданию они нужны,
// а с точки зрения проекта они не используются, а значит якорь для системы
//        [1:26:48] Савинюк Р.В.: то же самое для большинства методов в файлах
//        [1:27:41] Савинюк Р.В.: и в музыкальном магазине
//        [1:29:49] Савинюк Р.В.: в 5 уроке при поиске макс - мин - небольшой хардкодинг, который можно вынести в константу
//        [1:32:18] Савинюк Р.В.: тоже небольшой хардкодинг в методе initArray
//        [1:32:31] Савинюк Р.В.: сортировки