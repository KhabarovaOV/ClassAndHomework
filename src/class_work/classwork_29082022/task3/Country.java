package class_work.classwork_29082022.task3;

import class_work.classwork_29082022.task2.Town;

import java.util.Scanner;

public class Country {
    private String nameOfCountry;
    private String nameOfContinent;
    private int numbersOfPeopleOfCountry;
    private int phoneCodeOfCountry;
    private String nameOfCapital;
    private String nameOfTownsOfCountry;
    private Town[] towns;


    public Country(String nameOfCountry,
                   String nameOfContinent) {
        this.nameOfCountry = nameOfCountry;
        this.nameOfContinent = nameOfContinent;
    }

    public Country(String nameOfCountry,
                   String nameOfContinent,
                   int numbersOfPeopleOfCountry,
                   int phoneCodeOfCountry) {
        this.nameOfCountry = nameOfCountry;
        this.nameOfContinent = nameOfContinent;
        this.numbersOfPeopleOfCountry = numbersOfPeopleOfCountry;
        this.phoneCodeOfCountry = phoneCodeOfCountry;
    }

    public Country(String nameOfCountry,
                   String nameOfContinent,
                   int numbersOfPeopleOfCountry,
                   int phoneCodeOfCountry,
                   String nameOfCapital,
                   String nameOfTownsOfCountry,
                   Town[] towns) {
        this.nameOfCountry = nameOfCountry;
        this.nameOfContinent = nameOfContinent;
        this.numbersOfPeopleOfCountry = numbersOfPeopleOfCountry;
        this.phoneCodeOfCountry = phoneCodeOfCountry;
        this.nameOfCapital = nameOfCapital;
        this.nameOfTownsOfCountry = nameOfTownsOfCountry;
        this.towns = towns;
    }

}
