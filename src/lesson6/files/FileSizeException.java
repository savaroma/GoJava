package lesson6.files;

public class FileSizeException extends Exception {

    public FileSizeException(String message) {
        super(message);
    }

    public FileSizeException(String message, Exception innerEx) {
        super(message, innerEx);
    }
}
