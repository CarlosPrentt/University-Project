package org.university.view;

import org.university.data.*;
import org.university.persistence.InicializeData;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        University university = InicializeData.loadUniversity();
        byte option;

        do {
            System.out.println("Welcome to Globant University, please choose an option" +
                    "\n1. Print all the professors with its data." +
                    "\n2. Print all the classes." +
                    "\n3. Create a new student and add it to an existing class." +
                    "\n4. Create a new class." +
                    "\n5. List classes with students given." +
                    "\n6. Exit.");
            option = scan.nextByte();
            if(option == 1){
                System.out.println("The teachers are: ");
                for (int i = 0; i < university.getTeachers().size(); i++) {
                    System.out.println(university.getTeachers().get(i).toString());
                }
            } else if(option == 2){
                byte classOption;
                System.out.println("The classes are, please write the classroom's number you want to see details about it: ");
                for (int i = 0; i < university.getUniversityClasses().size(); i++) {
                    System.out.println("Class Name: " + university.getUniversityClasses().get(i).getName() + ", Classroom: " + university.getUniversityClasses().get(i).getClassroom());
                }
                    classOption = scan.nextByte();
                    for (int i = 0; i < university.getUniversityClasses().size(); i++) {
                        if(classOption == university.getUniversityClasses().get(i).getClassroom()) {
                            System.out.println("The class details are: " + university.getUniversityClasses().get(i).toString());
                        }
                    }
            } else if(option == 3){
                System.out.println("Please write the name of the student");
                String studentName = scan.next();
                System.out.println("Please the student's age");
                int studentAge = scan.nextInt();
                System.out.println("please write the classroom's number you want to add this student: ");
                for (int i = 0; i < university.getUniversityClasses().size(); i++) {
                    System.out.println("Class Name: " + university.getUniversityClasses().get(i).getName() + ", Classroom: " + university.getUniversityClasses().get(i).getClassroom());
                }
                int classroom = scan.nextInt();
                university.createStudent(studentName, studentAge, classroom);
                System.out.println("The student has been created successfully");
            } else if(option == 4){
                ArrayList<Student> students = new ArrayList<>();
                System.out.println("Please write the name of the class you want to create: ");
                String className = scan.next();
                System.out.println("Please write the classroom's number different to the next: ");
                for (int i = 0; i < university.getUniversityClasses().size(); i++) {
                    System.out.println("Class Name: " + university.getUniversityClasses().get(i).getName() + ", Classroom: " + university.getUniversityClasses().get(i).getClassroom());
                }
                int classroom = scan.nextInt();

                int studentOptions;
                do{
                    System.out.println("Please write the students' ids you want to add: ");
                    for (int i = 0; i < university.getStudents().size(); i++) {
                        System.out.println(university.getStudents().get(i).getIdStudent() + ", Name: "
                                + university.getStudents().get(i).getName());
                    }
                    studentOptions = scan.nextInt();
                    students.add(university.getStudents().get(studentOptions));
                }while(studentOptions != 0);

                System.out.println("Please write the teacher's id you want to take the class: ");
                for (int i = 0; i < university.getTeachers().size(); i++) {
                    System.out.println(university.getTeachers().get(i).getIdTeacher() + ", Name: "
                            + university.getTeachers().get(i).getName());
                }
                int teacherId = scan.nextInt();
                for (int i = 0; i < university.getTeachers().size(); i++) {
                    if(teacherId == university.getTeachers().get(i).getIdTeacher()){
                       university.createClass(className, classroom, university.getTeachers().get(i), students);
                    }
                }
            } else if(option == 5) {
                System.out.println("Please write the student's id who you want to know which classes the student is taken");
                for (int i = 0; i < university.getStudents().size(); i++) {
                    System.out.println(university.getStudents().get(i).getIdStudent() + ", Name: "
                    + university.getStudents().get(i).getName());
                }
                int studentId = scan.nextInt();
                for (int i = 0; i < university.getStudents().size(); i++) {
                    if(studentId == university.getStudents().get(i).getIdStudent()){
                        for (int j = 0; j < university.getUniversityClasses().size(); j++) {
                            System.out.println(university.getUniversityClasses().get(j).getName());
                        }
                    }
                }

            }
        }while(option != 6);
    }
}
