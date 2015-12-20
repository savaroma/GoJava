package lesson3.files;

public class AudioFile extends File {
    public AudioFile() {
        super.setContent("");
        super.setName("unnamed");
        super.setExt("audio");
        super.setSize(0);
        super.setReadOnly(false);
    }

    public AudioFile(Directory dir) {
        super.setContent("");
        super.setName("unnamed");
        super.setExt("audio");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }

    public AudioFile(Directory dir, String content) {
        super.setContent(content);
        super.setName("unnamed");
        super.setExt("audio");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }

    public AudioFile(String name) {
        super.setContent("");
        super.setName(name);
        super.setExt("audio");
        super.setSize(0);
        super.setReadOnly(false);
    }

    public AudioFile(String name, String content) {
        super.setContent(content);
        super.setName(name);
        super.setExt("audio");
        super.setSize(0);
        super.setReadOnly(false);
    }

    public AudioFile(String name, Directory dir) {
        super.setContent("");
        super.setName(name);
        super.setExt("audio");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }

    public AudioFile(String name, String content, Directory dir) {
        super.setContent(content);
        super.setName(name);
        super.setExt("audio");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }

    public AudioFile(String name, Directory dir, Integer size) {
        super.setContent("");
        super.setName(name);
        super.setExt("audio");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }

    public AudioFile(String name, String content, Directory dir, Integer size) {
        super.setContent(content);
        super.setName(name);
        super.setExt("audio");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }

    public AudioFile(String name, Integer size) {
        super.setContent("");
        super.setName(name);
        super.setExt("audio");
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }

    public AudioFile(String name, String content, Integer size) {
        super.setContent(content);
        super.setName(name);
        super.setExt("audio");
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }

    public AudioFile(String name, Directory dir, Integer size, boolean readOnly) {
        super.setContent("");
        super.setName(name);
        super.setExt("audio");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }

    public AudioFile(String name, String content, Directory dir, Integer size, boolean readOnly) {
        super.setContent(content);
        super.setName(name);
        super.setExt("audio");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }

    public AudioFile(Directory dir, Integer size, boolean readOnly) {
        super.setContent("");
        super.setName("Unnamed");
        super.setExt("audio");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }

    public AudioFile(Directory dir, String content, Integer size, boolean readOnly) {
        super.setContent(content);
        super.setName("Unnamed");
        super.setExt("audio");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }
}
