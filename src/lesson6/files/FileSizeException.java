package lesson6.files;

public class FileSizeException extends Exception {
    File file;

    public FileSizeException(final File file){
        this.file = file;
    }

    public int getFileSize(){
        return file.getSize();
    }

    //эксепшен как правило возвращает месседж об исключительной ситуации, но не данные
    //размер файла может отдавать только класс File
}
