package class_work.classwork_29082022.task1;

import class_work.classwork_29082022.task5.Book;
import class_work.classwork_29082022.task6.Car;

import java.time.LocalDate;
import java.util.Scanner;

public class Human {
    private String name;
    private LocalDate dateBorn;
    private int contactPhone;
    private String town;
    private String country;
    private String homeAddress;
    private Book[] library;
    private Car[] car;

    public Human(String name,
                 LocalDate dateBorn) {
        this.name = name;
        this.dateBorn = dateBorn;
    }

    public Human(String name,
                 LocalDate dateBorn,
                 int contactPhone,
                 String town) {
        this.name = name;
        this.dateBorn = dateBorn;
        this.contactPhone = contactPhone;
        this.town = town;
    }

    public Human(String name,
                 LocalDate dateBorn,
                 int contactPhone,
                 String town,
                 String country,
                 String homeAddress,
                 Book[] library,
                 Car[] car) {
        this.name = name;
        this.dateBorn = dateBorn;
        this.contactPhone = contactPhone;
        this.town = town;
        this.country = country;
        this.homeAddress = homeAddress;
        this.library = library;
        this.car = car;
    }
}
