package class_work.classwork_25082022.task3;

import java.util.Scanner;

public class Country {
    private String nameOfCountry;
    private String nameOfContinent;
    private int numbersOfPeopleOfCountry;
    private int phoneCodeOfCountry;
    private String nameOfCapital;
    private String nameOfTownsOfCountry;
    Scanner sc = new Scanner(System.in);

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry() {
        System.out.println("Enter name of Country: ");
        this.nameOfCountry = sc.nextLine();
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public void setNameOfContinent() {
        System.out.println("Enter name of continent: ");
        this.nameOfContinent = sc.nextLine();
    }

    public int getNumbersOfPeopleOfCountry() {
        return numbersOfPeopleOfCountry;
    }

    public void setNumbersOfPeopleOfCountry() {
        System.out.println("Enter numbers of people of country: ");
        this.numbersOfPeopleOfCountry = sc.nextInt();
    }

    public int getPhoneCodeOfCountry() {
        return phoneCodeOfCountry;
    }

    public void setPhoneCodeOfCountry() {
        System.out.println("Enter phone code of Country: ");
        this.phoneCodeOfCountry = sc.nextInt();
    }

    public String getNameOfCapital() {
        return nameOfCapital;
    }

    public void setNameOfCapital() {
        System.out.println("Enter name of capital: ");
        this.nameOfCapital = sc.nextLine();
    }

    public String getNameOfTownsOfCountry() {
        return nameOfTownsOfCountry;
    }

    public void setNameOfTownsOfCountry() {
        System.out.println("Enter name of towns of country");
        this.nameOfTownsOfCountry = sc.nextLine();
    }
}
