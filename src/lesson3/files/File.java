package lesson3.files;

public abstract class File {
    private String name;
    private String ext;
    private Integer size;
    private boolean readOnly;
    private Directory parentDir;
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

    public  void  setExt(String ext){
        this.ext = ext;
    }
    public String getExt(){
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
    public String isReadOnly(){// такое наименование, которое начинается с is или has - присуще boolean типу. Может boolean и string объединить, поменять логику.
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
            return parentDir.getName();
        }

    }
    public void setParentDir(Directory ParentDir){
        this.parentDir = ParentDir;
    }


    protected void showDir() {
        System.out.println("Directory: " + this.getParentDir());
    }

    protected void showFile() { System.out.println(" --- " + this.getName() + "." +
            this.getExt() + "( size: " + this.getSize() + " )" + "rights: " +
            this.isReadOnly());
    }

     public void fileInfo(){    //Спасибо, что тыкнуля сюда носом. И правда сам не догадался. Так правильнее же?
        showDir();
        showFile();
    }
    //жублирование кода
    //если ты выносишь информацию о директории в отдельный метод, тогда в методе fileInfo можно использовать этот метод, а не дублировать код.

 }