package class_work.classwork_25082022.task2;

import java.util.Scanner;

public class Town {
    private String nameTown;
    private String region;
    private String country;
    private int numbersOfPeople;
    private int postcode;
    private int phoneCode;
    private Scanner sc = new Scanner(System.in);

    public String getNameTown() {
        return nameTown;
    }

    public void setNameTown() {
        System.out.println("Enter name of Town: ");
        this.nameTown = sc.nextLine();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion() {
        System.out.println("Enter region Town: ");
        ;
        this.region = sc.nextLine();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        System.out.println("Enter country: ");
        this.country = sc.nextLine();
    }

    public int getNumbersOfPeople() {
        return numbersOfPeople;
    }

    public void setNumbersOfPeople() {
        System.out.println("Enter numbers of people: ");
        this.numbersOfPeople = sc.nextInt();
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode() {
        System.out.println("Enter postcode: ");
        this.postcode = sc.nextInt();
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode() {
        System.out.println("Enter phone code: ");
        this.phoneCode = sc.nextInt();
    }
}
