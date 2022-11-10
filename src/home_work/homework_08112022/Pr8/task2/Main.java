package home_work.homework_08112022.Pr8.task2;

public class Main {
    public static void main(String[] args) {
        Employee mary = new Employee("Mary","married", 27, 3);
        System.out.println(mary.getName()+ " " +mary.getAge()+ " " + mary.getStatus()+ " " + mary.getWorkExperience()+ " " +mary.getToday());
        mary.setAge(28);
        mary.setToday(11.25);
        System.out.println(mary.getAge()+" "+mary.getToday());
        mary.setAge(101);
        System.out.println(mary.getAge());
    }


}
