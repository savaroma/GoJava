package lesson6.files;

public class Directory extends File {
    public Directory() {
        super.setName("\\");
        super.setExt("DIR");
    }

    public Directory(String name) {
        super.setName(name);
        super.setExt("DIR");
    }

    public Directory(String name, Directory ParentDir) {
        super.setName(name);
        super.setExt("DIR");
        super.setParentDir(ParentDir);
    }
}
