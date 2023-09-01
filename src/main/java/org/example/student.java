package org.example;
public class student {
    private String hno;
    private String name;

    public student(String hno, String name) {
        this.hno = hno;
        this.name = name;
    }

    public student(String hno) {
        this.hno = hno;
    }

    public student() {
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "hno='" + hno + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
