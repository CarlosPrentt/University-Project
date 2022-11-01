package org.university.data;

import java.util.ArrayList;
import java.util.List;

public class UniversityClass {
    private String name;
    private int classroom;
    private Teacher teacher;
    private ArrayList<Student> students;

    private boolean isClassName = true;

    public boolean isClassName() {
        return isClassName;
    }

    public void setClassName(boolean className) {
        isClassName = className;
    }

    public ArrayList<Student> getStudentToAClass() {
        return students;
    }

    public String toString() {
        return "\nClass: " + getName() +
        " - Classroom number: " + getClassroom() +
        " - Teacher: " + getTeacher().getName() +
        " - Student list: " + getStudents();
    }

    public String toStringName() {
        return "\nClass: " + getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public UniversityClass(String name, int classroom, Teacher teacher, ArrayList<Student> students) {
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        this.students = students;
    }
}
