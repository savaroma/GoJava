package lesson9.files;

public class AudioFile extends File {
    private static String fileType = "audio";

    public AudioFile() {
        super.setContent(INIT_EMPTY_CONTENT); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setName(UNNAMED_FILE); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setReadOnly(false);
    }

    public AudioFile(Directory dir) {
        super.setContent(INIT_EMPTY_CONTENT); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setName(UNNAMED_FILE); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setParentDir(dir);
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setReadOnly(false);
    }

    public AudioFile(Directory dir, String content) {
        super.setContent(content);
        super.setName(UNNAMED_FILE); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setParentDir(dir);
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setReadOnly(false);
    }

    public AudioFile(String name) {
        super.setContent(INIT_EMPTY_CONTENT); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setName(name);
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setReadOnly(false);
    }

    public AudioFile(String name, String content) {
        super.setContent(content);
        super.setName(name);
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setReadOnly(false);
    }

    public AudioFile(String name, Directory dir) {
        super.setContent(INIT_EMPTY_CONTENT); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setName(name);
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setParentDir(dir);
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setReadOnly(false);
    }

    public AudioFile(String name, String content, Directory dir) {
        super.setContent(content);
        super.setName(name);
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setParentDir(dir);
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setReadOnly(false);
    }

    public AudioFile(String name, Directory dir, Integer size) {
        super.setContent(INIT_EMPTY_CONTENT); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setName(name);
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setParentDir(dir);
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setSize(size);
        super.setReadOnly(false);
    }

    public AudioFile(String name, String content, Directory dir, Integer size) {
        super.setContent(content);
        super.setName(name);
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setParentDir(dir);
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setSize(size);
        super.setReadOnly(false);
    }

    public AudioFile(String name, Integer size) {
        super.setContent(INIT_EMPTY_CONTENT); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setName(name);
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setSize(size);
        super.setReadOnly(false);
    }

    public AudioFile(String name, String content, Integer size) {
        super.setContent(content);
        super.setName(name);
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setSize(size);
        super.setReadOnly(false);
    }

    public AudioFile(String name, Directory dir, Integer size, boolean readOnly) {
        super.setContent(INIT_EMPTY_CONTENT); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setName(name);
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setParentDir(dir);
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setSize(size);
        super.setReadOnly(readOnly);
    }

    public AudioFile(String name, String content, Directory dir, Integer size, boolean readOnly) {
        super.setContent(content);
        super.setName(name);
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setParentDir(dir);
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setSize(size);
        super.setReadOnly(readOnly);
    }

    public AudioFile(Directory dir, Integer size, boolean readOnly) {
        super.setContent(INIT_EMPTY_CONTENT); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setName(UNNAMED_FILE); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setParentDir(dir);
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setSize(size);
        super.setReadOnly(readOnly);
    }

    public AudioFile(Directory dir, String content, Integer size, boolean readOnly) {
        super.setContent(content);
        super.setName(UNNAMED_FILE); // Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setExt(fileType);// Anti pattern hard coding Unnamed file name extracting to CONST in File class
        super.setParentDir(dir);
        super.setSize(INIT_SIZE);//Anti pattern hard coding 0 extracting to CONST in File class
        super.setSize(size);
        super.setReadOnly(readOnly);
    }
}
