package lesson3.files;

public abstract class File {
    private String name;
    private String ext;
    private Integer size;
    private boolean readOnly;
    private Directory ParentDir;
    private String content;

    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }
    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }

    public  void  setExtention(String ext){
        this.ext = ext;
    }
    public String getExtention(){
        return ext;
    }

    public void setSize(Integer size){
        this.size = size;
    }
    public Integer getSize(){
        return size;
    }

    public void setReadOnly(Boolean readOnly){
        this.readOnly = readOnly;
    }
    public Boolean getReadOnly(){
        return readOnly;
    }
    public String isReadOnly(){
        if(this.readOnly){
            return "read only";
        }
        else {
            return "writable";
        }
    }
    public String getParentDir(){
        if (this.name.equals("\\")){
            return "root Dir";
        } else {
            return ParentDir.getName();
        }

    }
    public void setParentDir(Directory ParentDir){
        this.ParentDir = ParentDir;
    }

     protected void fileInfo(){
        System.out.println("Directory: " + this.getParentDir());
        System.out.println(" --- " + this.getName() + "." + this.getExtention()
                + "( size: " + this.getSize() + " )" + "rights: " + this.isReadOnly());
    }
    protected void dirInfo() {
        System.out.println("Directory: " + this.getParentDir());
    }

 }