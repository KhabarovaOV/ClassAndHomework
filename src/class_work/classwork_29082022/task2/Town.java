package class_work.classwork_29082022.task2;

import class_work.classwork_29082022.task1.Human;

import java.util.Scanner;

public class Town {
    private String nameTown;
    private String region;
    private String country;
    private int numbersOfPeople;
    private int postcode;
    private int phoneCode;
    private Human[] person;

    public Town(String nameTown,
                String region) {
        this.nameTown = nameTown;
        this.region = region;
    }

    public Town(String nameTown,
                String region,
                String country,
                int numbersOfPeople) {
        this.nameTown = nameTown;
        this.region = region;
        this.country = country;
        this.numbersOfPeople = numbersOfPeople;
    }

    public Town(String nameTown,
                String region,
                String country,
                int numbersOfPeople,
                int postcode,
                int phoneCode,
                Human[] person) {
        this.nameTown = nameTown;
        this.region = region;
        this.country = country;
        this.numbersOfPeople = numbersOfPeople;
        this.postcode = postcode;
        this.phoneCode = phoneCode;
        this.person = person;
    }
}
