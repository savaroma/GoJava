package lesson3.files;

public class Directory extends File{
    public Directory(){
        super.setName("\\");
        super.setExtention("DIR");
    }
    public Directory(String name){
        super.setName(name);
        super.setExtention("DIR");
    }
    public Directory(String name, Directory ParentDir){
        super.setName(name);
        super.setExtention("DIR");
        super.setParentDir(ParentDir);
    }
}
