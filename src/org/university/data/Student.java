package org.university.data;

public class Student {
    private String name;
    private int idStudent;

    private int age;

    public Student(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "\nStudent: " + getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }
}
