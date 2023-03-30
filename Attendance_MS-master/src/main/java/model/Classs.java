package model;

public class Classs {
    int id;
    String classname;

    public Classs(int id, String classname) {
        this.id = id;
        this.classname = classname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
