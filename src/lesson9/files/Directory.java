package lesson9.files;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
    List<File> filesList = new ArrayList<>(); //в прошлом комменте спросила, почему есть доступ к этому списку? где инкапсуляция?
    //необходимо сделать его private и если понадобится - создать геттер на весь лист.

    public Directory() {
        super.setName("root");
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

    public void addFile(File file) {
        filesList.add(file);
    }

    public void getDirectoryInfo() {
        System.out.println(super.getName() + "/");
        filesList
                .forEach(System.out::println);
    }

    public String getFileContent(int index) {
        return this.filesList.get(index).getContent();
    }

    public String getFileName(int index) {
        return this.filesList.get(index).getName();
    }
}
