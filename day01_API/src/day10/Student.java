package day10;

public class Student implements java.io.Serializable{
    public String name;
    public String Pwd;

    public Student(String name, String address) {
        this.name = name;
        this.Pwd = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }
}
