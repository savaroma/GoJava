package lesson3.files;

public class ImageFile extends File{
    public ImageFile(){
        super.setContent("");
        super.setName("unnamed");
        super.setExt("img");
        super.setSize(0);
        super.setReadOnly(false);
    }
    public ImageFile(Directory dir){
        super.setContent("");
        super.setName("unnamed");
        super.setExt("img");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }
    public ImageFile(Directory dir, String content){
        super.setContent(content);
        super.setName("unnamed");
        super.setExt("img");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }
    public ImageFile(String name) {
        super.setContent("");
        super.setName(name);
        super.setExt("img");
        super.setSize(0);
        super.setReadOnly(false);
    }
    public ImageFile(String name, String content) {
        super.setContent(content);
        super.setName(name);
        super.setExt("img");
        super.setSize(0);
        super.setReadOnly(false);
    }
    public ImageFile(String name, Directory dir){
        super.setContent("");
        super.setName(name);
        super.setExt("img");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }
    public ImageFile(String name, String content, Directory dir){
        super.setContent(content);
        super.setName(name);
        super.setExt("img");
        super.setParentDir(dir);
        super.setSize(0);
        super.setReadOnly(false);
    }
    public ImageFile(String name, Directory dir, Integer size){
        super.setContent("");
        super.setName(name);
        super.setExt("img");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }
    public ImageFile(String name, String content, Directory dir, Integer size){
        super.setContent(content);
        super.setName(name);
        super.setExt("img");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }
    public ImageFile(String name, Integer size){
        super.setContent("");
        super.setName(name);
        super.setExt("img");
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }
    public ImageFile(String name, String content, Integer size){
        super.setContent(content);
        super.setName(name);
        super.setExt("img");
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(false);
    }
    public ImageFile(String name, Directory dir, Integer size, boolean readOnly){
        super.setContent("");
        super.setName(name);
        super.setExt("img");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }
    public ImageFile(String name, String content, Directory dir, Integer size, boolean readOnly){
        super.setContent(content);
        super.setName(name);
        super.setExt("img");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }
    public ImageFile(Directory dir, Integer size, boolean readOnly){
        super.setContent("");
        super.setName("Unnamed");
        super.setExt("img");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }
    public ImageFile(Directory dir, String content,Integer size, boolean readOnly){
        super.setContent(content);
        super.setName("Unnamed");
        super.setExt("img");
        super.setParentDir(dir);
        super.setSize(0);
        super.setSize(size);
        super.setReadOnly(readOnly);
    }
}
