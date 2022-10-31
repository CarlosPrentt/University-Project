package org.university.data;

public class TeacherPartTime extends Teacher {
    private double salary;
    private int weekHours;

    private int activeHours = 20;

    public String toString() {
        return "\nName: " + getName() +
                " - Id: " + getIdTeacher() +
                " - Salary: " + getSalary() +
                " - Week hours: " + getWeekHours();
    }

    public TeacherPartTime(String name, int idTeacher, double salary, int weekHours) {
        super(name, idTeacher);
        this.setSalary(salary);
        this.setWeekHours(weekHours);
    }

    public int getActiveHours() {
        return activeHours;
    }

    public void setActiveHours(int activeHours) {
        this.activeHours = activeHours;
    }

    public double getSalary() {
        double finalSalary = salary * activeHours;
        return finalSalary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWeekHours() {
        return weekHours;
    }

    public void setWeekHours(int weekHours) {
        this.weekHours = weekHours;
    }
}
