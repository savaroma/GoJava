package lesson3.files;

public abstract class File {
    private String name;
    private String ext;
    private Integer size;
    private boolean readOnly;
    private Directory parentDir;
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }// все еще не между всеми методами есть пустая строка

    public String getExt() {
        return ext;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public String ReadOnlyStr() { //название метода с маленькой буквы
        if (this.readOnly) {
            return "read only";
        } else {
            return "writable";
        }
    }

    public String getParentDir() {
        if (this.name.equals("\\")) {
            return "root";
        } else {
            return parentDir.getName();
        }

    }

    public void setParentDir(Directory ParentDir) {
        this.parentDir = ParentDir;
    }

    public void serParentDir() { //если метод не вызывается - это мертвый код, удалить. Или вызвать))
        this.parentDir.setName("root");
    }

    protected void showDir() {
        System.out.println("Directory: " + this.getParentDir());
    }

    protected void showFile() {
        System.out.println(" --- " + this.getName() + "." +
                this.getExt() + "( size: " + this.getSize() + " )" + "rights: " +
                this.ReadOnlyStr());
    }

    public void fileInfo() {
        showDir();
        showFile();
    }
}