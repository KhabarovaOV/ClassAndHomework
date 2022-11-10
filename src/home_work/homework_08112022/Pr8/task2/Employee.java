package home_work.homework_08112022.Pr8.task2;

import java.util.Calendar;

public class Employee {
    private String name;
    private int age;
    private String status;
    private int workExperience;
    public final double today = 10.11;

    public Employee( String name, String status, int age, int workExperience) {
        setName(name);
        setAge(age);
        setStatus(status);
        setWorkExperience(workExperience);
    }

    public double getToday() {
        return this.today;
    }
public double setToday(double today){
        return today;
}
    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return this.workExperience;
    }
}
