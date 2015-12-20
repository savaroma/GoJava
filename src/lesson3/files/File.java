package lesson3.files;

public abstract class File {
    private String name;
    private String ext;
    private Integer size;
    private boolean readOnly;
    private Directory ParentDir;//название переменной всегда с маленькой буквы (исключение - константы)
    private String content;

    public void setContent(String content){
        this.content = content;
    }// между методами одна пустая строка должна быть
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
    }// как правило геттеры и сеттеры используют то же имя, что и переменная, например, getExt, setExt - так легче ориентироваться
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
            return ParentDir.getName();
        }

    }
    public void setParentDir(Directory ParentDir){
        this.ParentDir = ParentDir;
    }

     protected void fileInfo(){// почему этот метод протекдит? есть в этом сакральный смысл?))
        System.out.println("Directory: " + this.getParentDir());
        System.out.println(" --- " + this.getName() + "." + this.getExtention()
                + "( size: " + this.getSize() + " )" + "rights: " + this.isReadOnly());
    }
    protected void dirInfo() {
        System.out.println("Directory: " + this.getParentDir());
    }//жублирование кода
    //если ты выносишь информацию о директории в отдельный метод, тогда в методе fileInfo можно использовать этот метод, а не дублировать код.

 }