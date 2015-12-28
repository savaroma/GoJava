package lesson6.files;

public class TextFile extends File {
    public TextFile() {
        super.setContent("");
        super.setName("unnamed");
        super.setExt("txt");
        super.setSize(0);
        super.setReadOnly(false);
    }

    public TextFile(Directory dir) {
        super.setContent("");
        super.setName("unnamed");
        super.setExt("txt");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }

    public TextFile(Directory dir, String content) {
        super.setContent(content);
        super.setName("unnamed");
        super.setExt("txt");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }

    public TextFile(String name) {
        super.setContent("");
        super.setName(name);
        super.setExt("txt");
        super.setSize(0);
        super.setReadOnly(false);
    }

    public TextFile(String name, String content) {
        super.setContent(content);
        super.setName(name);
        super.setExt("txt");
        super.setSize(0);
        super.setReadOnly(false);
    }

    public TextFile(String name, Directory dir) {
        super.setContent("");
        super.setName(name);
        super.setExt("txt");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }

    public TextFile(String name, String content, Directory dir) {
        super.setContent(content);
        super.setName(name);
        super.setExt("txt");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }

    public TextFile(String name, Directory dir, Integer size) {
        super.setContent("");
        super.setName(name);
        super.setExt("txt");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }

    public TextFile(String name, String content, Directory dir, Integer size) {
        super.setContent(content);
        super.setName(name);
        super.setExt("txt");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }

    public TextFile(String name, Integer size) {
        super.setContent("");
        super.setName(name);
        super.setExt("txt");
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }

    public TextFile(String name, String content, Integer size) {
        super.setContent(content);
        super.setName(name);
        super.setExt("txt");
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }

    public TextFile(String name, Directory dir, Integer size, boolean readOnly) {
        super.setContent("");
        super.setName(name);
        super.setExt("txt");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }

    public TextFile(String name, String content, Directory dir, Integer size, boolean readOnly) {
        super.setContent(content);
        super.setName(name);
        super.setExt("txt");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }

    public TextFile(Directory dir, Integer size, boolean readOnly) {
        super.setContent("");
        super.setName("Unnamed");
        super.setExt("txt");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }

    public TextFile(Directory dir, String content, Integer size, boolean readOnly) {
        super.setContent(content);
        super.setName("Unnamed");
        super.setExt("txt");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }
}
