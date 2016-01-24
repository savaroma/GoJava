package lesson8.files;

import com.sun.org.apache.xpath.internal.SourceTree; //подчищаем неиспользованные импорты

import java.util.ArrayList;
import java.util.Comparator;

public class Directory extends File {
    ArrayList<File> filesList;
    Comparator<File> byFileName;

    public Directory() {
        super.setName("\\");
        super.setExt("DIR");
        this.filesList = new ArrayList<>();
    }

    public Directory(String name) {
        super.setName(name);
        super.setExt("DIR");
        this.filesList = new ArrayList<>();
    }

    public Directory(String name, Directory ParentDir) {
        super.setName(name);
        super.setExt("DIR");
        super.setParentDir(ParentDir);
        this.filesList = new ArrayList<>();
    }

    public void addFile(File file) {
        filesList.add(file);
    }

    public void getDirectoryInfo() { //название метода ни о чем, где глагол?
        System.out.println(super.getName() + " /");
        filesList
                .forEach(System.out::println);
    }

    public void dirSortedByName() {
        byFileName = (f1, f2) -> f1
                .getName()
                .compareTo(f2.getName());
        System.out.println(super.getName() + " /");
        filesList
                .stream()
                .sorted(byFileName)
                .forEach(System.out::println);
    }
}
