package org.university.view;

import org.university.data.*;
import org.university.persistence.InicializeData;

import java.sql.SQLOutput;
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
                    "\n4. Create a new class" +
                    "\n5. Exit.");
            option = scan.nextByte();
            if(option == 1){
                System.out.println("The teachers are: " + InicializeData.loadUniversity().getTeachers().toString());
            } else if(option == 2){
                byte classOption;
                System.out.println("The classes are, please write the classroom's number you want to see details about it: ");
                for (int i = 0; i < university.getUniversityClasses().size(); i++) {
                    System.out.println("Class Name: " + university.getUniversityClasses().get(i).getName() + ", Classroom: " + university.getUniversityClasses().get(i).getClassroom());
                }
                do{
                    classOption = scan.nextByte();
                    for (int i = 0; i < university.getUniversityClasses().size(); i++) {
                        if(classOption == university.getUniversityClasses().get(i).getClassroom()) {
                            System.out.println("The class details are: " + university.getUniversityClasses().get(i).toString());
                        }
                    }

                }while(classOption != 0);
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
                System.out.println("Please write the name of the class you want to create: ");
                String className = scan.next();
                System.out.println("Please write the classroom's number different to the next: ");
                for (int i = 0; i < university.getUniversityClasses().size(); i++) {
                    System.out.println("Class Name: " + university.getUniversityClasses().get(i).getName() + ", Classroom: " + university.getUniversityClasses().get(i).getClassroom());
                }
                int classroom = scan.nextInt();
                System.out.println("Please write the teacher's id you want to take the class: ");
                for (int i = 0; i < university.getTeachers().size(); i++) {
                    System.out.println(university.getTeachers().get(i).getIdTeacher() + ", Name: " + university.getTeachers().get(i).getName());
                }
                int teacherId = scan.nextInt();
                
            }
        }while(option != 5);
    }
}
