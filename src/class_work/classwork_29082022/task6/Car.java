package class_work.classwork_29082022.task6;

import java.util.Scanner;

public class Car {
    private String nameOfCar;
    private String nameOfManufacturer;
    private int releaseYear;
    private double engineVolume;

    private Scanner sc = new Scanner(System.in);

    public Car(String nameOfCar,
               String nameOfManufacturer) {
        this.nameOfCar = nameOfCar;
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public Car(String nameOfCar,
               String nameOfManufacturer,
               int releaseYear) {
        this.nameOfCar = nameOfCar;
        this.nameOfManufacturer = nameOfManufacturer;
        this.releaseYear = releaseYear;
    }

    public Car(String nameOfCar,
               String nameOfManufacturer,
               int releaseDate,
               double engineVolume) {
        this.nameOfCar = nameOfCar;
        this.nameOfManufacturer = nameOfManufacturer;
        this.releaseYear = releaseDate;
        this.engineVolume = engineVolume;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar() {
        System.out.println("Please, enter name of car: ");
        this.nameOfCar = sc.nextLine();
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer() {
        System.out.println("Please, enter name of manufacturer: ");
        this.nameOfManufacturer = sc.nextLine();
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear() {
        System.out.println("Please, enter release year: ");
        this.releaseYear = sc.nextInt();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        System.out.println("Please, enter engine volume: ");
        this.engineVolume = sc.nextDouble();
    }
}
