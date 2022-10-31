package org.university.persistence;

import org.university.data.*;

import java.util.ArrayList;
import java.util.List;


public class InicializeData {
    public static University loadUniversity(){
        Teacher teacher = new TeacherFullTime("Tomás", 1234, 1000000, 5);
        Teacher teacher2 = new TeacherFullTime("Sara", 6789, 2000000, 5);
        Teacher teacher3 = new TeacherPartTime("Raúl", 7308, 1200000, 48);
        Teacher teacher4 = new TeacherPartTime("Cristina", 8391, 1500000, 48);

        Student student = new Student("Gabriel", 4567);
        Student student2 = new Student("Catalina", 8163);
        Student student3 = new Student("Martín", 7811);
        Student student4 = new Student("Camilo", 1811);
        Student student5 = new Student("Diana", 8422);
        Student student6 = new Student("Pedro", 6482);

        University university = new University("Globant University");
        university.registerTeacher(teacher);
        university.registerTeacher(teacher2);
        university.registerTeacher(teacher3);
        university.registerTeacher(teacher4);

        university.registerStudent(student);
        university.registerStudent(student2);
        university.registerStudent(student3);
        university.registerStudent(student4);
        university.registerStudent(student5);
        university.registerStudent(student6);
        //Creating classes
        ArrayList<Student> mathStudents = new ArrayList<>();
        mathStudents.add(university.getStudents().get(0));
        mathStudents.add(university.getStudents().get(1));

        ArrayList<Student> spanishStudents = new ArrayList<>();
        spanishStudents.add(university.getStudents().get(3));
        spanishStudents.add(university.getStudents().get(4));

        ArrayList<Student> englishStudents = new ArrayList<>();
        englishStudents.add(university.getStudents().get(3));
        englishStudents.add(university.getStudents().get(4));

        ArrayList<Student> musicStudents = new ArrayList<>();
        musicStudents.add(university.getStudents().get(4));
        musicStudents.add(university.getStudents().get(5));

        UniversityClass universityClass = new UniversityClass("Math", 2, teacher, mathStudents);
        UniversityClass universityClass2 = new UniversityClass("Spanish", 5, teacher2, spanishStudents);
        UniversityClass universityClass3 = new UniversityClass("English", 3, teacher3, englishStudents);
        UniversityClass universityClass4 = new UniversityClass("Music", 4, teacher4, musicStudents);
        //Sending classes
        university.registerUniversityClasses(universityClass);
        university.registerUniversityClasses(universityClass2);
        university.registerUniversityClasses(universityClass3);
        university.registerUniversityClasses(universityClass4);

        return university;
    }
}
