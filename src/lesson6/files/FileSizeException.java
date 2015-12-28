package lesson6.files;

public class FileSizeException extends Exception {
    private int fileSize;

    public FileSizeException(final int fileSize){
        this.fileSize = fileSize;
    }

    public int getFileSize(){
        return fileSize;
    }

    //эксепшен как правило возвращает месседж об исключительной ситуации, но не данные
    //размер файла может отдавать только класс File
}
