package org.university.data;

public class Teacher {
    private String name;
    private int idTeacher;

    public Teacher(String name, int idTeacher) {
        this.setName(name);
        this.setIdTeacher(idTeacher);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }
}
