package lesson9.files;

import java.util.ArrayList;
import java.util.Comparator;

public class Directory extends File {
    ArrayList<File> filesList; //Полиморфизм List<>
    //И что это за фамильярный доступ к списку?)) Давай инкапсуляцию и геттер
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

    public void dir() {//тут не хватило сил переименовать?)))
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
