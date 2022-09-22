package class_work.classwork_25082022.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Human {
    private String name;
    private LocalDate dateBorn;
    private int contactPhone;
    private String town;
    private String country;
    private String homeAddress;
    private Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Enter person name: ");
        this.name = sc.nextLine();
    }

    public LocalDate getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(LocalDate dateBorn) {
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.println("Enter person date born: ");
        this.dateBorn = LocalDate.of(year, month, day);
    }

    public int getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(int contactPhone) {
        System.out.println("Enter person contact phone: ");
        this.contactPhone = sc.nextInt();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        System.out.println("Enter person town: ");
        this.town = sc.nextLine();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        System.out.println("Enter person country: ");
        this.country = sc.nextLine();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        System.out.println("Enter person date home address: ");
        this.homeAddress = sc.nextLine();
    }
}

