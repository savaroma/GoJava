package lesson8.files;

public abstract class File {
    public static final int INIT_SIZE = 0; //Anti pattern "hard coding" extracted to CONST
    public static final String UNNAMED_FILE = "Unnamed"; //Anti pattern "hard coding" extracted to CONST
    public static final String INIT_EMPTY_CONTENT = ""; // Anti pattern hard coding Unnamed file name extracted
    private String name;
    private String ext;
    private Integer size;
    private boolean readOnly;
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

    public void setParentDir(Directory ParentDir) {
    }

    @Override
    public String toString(){
        return "    type='" + ext + '\'' +
                "name = '" + name + '\'' +
                "size = '" + size + '\'' +
                "readOnly = '" + readOnly + '\'';
    }
}