package org.university.data;

import org.university.data.Teacher;

public class TeacherFullTime extends Teacher {
    private double salary;
    private int yearsExperience;

    public String toString() {
        return "\nName: " + getName() +
                " - Id: " + getIdTeacher() +
                " - Salary: " + getSalary() +
                " - Years experience: " + getYearsExperience();
    }
    public TeacherFullTime(String name, int idTeacher, double salary, int yearsExperience) {
        super(name, idTeacher);
        this.setSalary(salary);
        this.setYearsExperience(yearsExperience);
    }

    public double getSalary() {
        double finalSalary = yearsExperience * 1.1;
        return salary * finalSalary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
}
