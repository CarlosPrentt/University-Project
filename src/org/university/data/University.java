package org.university.data;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<UniversityClass> universityClasses;

    public University(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.universityClasses = new ArrayList<>();
    }

    public University() {}

    public void registerTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void registerStudent(Student student){
        student.setIdStudent(students.size() + 1);
        students.add(student);
    }

    public void registerUniversityClasses(UniversityClass universityClass){
        universityClasses.add(universityClass);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<UniversityClass> getUniversityClasses() {
        return universityClasses;
    }

    public void createStudent(String name, int age, int classroomToAdd) {
        Student student = new Student(name, age);
        registerStudent(student);
        for (int i = 0; i < universityClasses.size(); i++) {
            if(classroomToAdd == universityClasses.get(i).getClassroom()) {
                universityClasses.get(i).getStudentToAClass().add(student);
            }
        }
    }

    public void createClass(String name, int classroom, Teacher teacher, ArrayList<Student> students){
        UniversityClass universityClass = new UniversityClass(name, classroom, teacher, students);
        registerUniversityClasses(universityClass);
    }
}
