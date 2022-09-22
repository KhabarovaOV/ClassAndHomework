package class_work.classwork_29082022.task5;

import java.util.Scanner;

public class Book {
    private String nameOfBook;
    private String fioAuthor;
    private int yearOfIssue;
    private String nameOfPublishingHouse;
    private String bookGenre;
    private int numbersOfPages;
    private Scanner sc = new Scanner(System.in);

    public Book(String nameOfBook,
                String fioAuthor) {
        this.nameOfBook = nameOfBook;
        this.fioAuthor = fioAuthor;
    }

    public Book(String nameOfBook,
                String fioAuthor,
                int yearOfIssue,
                String nameOfPublishingHouse) {
        this.nameOfBook = nameOfBook;
        this.fioAuthor = fioAuthor;
        this.yearOfIssue = yearOfIssue;
        this.nameOfPublishingHouse = nameOfPublishingHouse;
    }

    public Book(String nameOfBook,
                String fioAuthor,
                int yearOfIssue,
                String nameOfPublishingHouse,
                String bookGenre,
                int numbersOfPages) {
        this.nameOfBook = nameOfBook;
        this.fioAuthor = fioAuthor;
        this.yearOfIssue = yearOfIssue;
        this.nameOfPublishingHouse = nameOfPublishingHouse;
        this.bookGenre = bookGenre;
        this.numbersOfPages = numbersOfPages;
    }

    public String getNameOfBook() {

        return nameOfBook;
    }

    public void setNameOfBook() {
        System.out.println("Please, enter name of book: ");
        this.nameOfBook = sc.nextLine();
    }

    public String getFioAuthor() {
        return fioAuthor;
    }

    public void setFioAuthor() {
        System.out.println("Please, enter fio author: ");
        this.fioAuthor = sc.nextLine();
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        System.out.println("Please, enter year of issue: ");
        this.yearOfIssue = sc.nextInt();
    }

    public String getNameOfPublishingHouse() {
        return nameOfPublishingHouse;
    }

    public void setNameOfPublishingHouse() {
        System.out.println("Please, enter name of publishing house: ");
        this.nameOfPublishingHouse = sc.nextLine();
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        System.out.println("Please, enter book genre: ");
        this.bookGenre = sc.nextLine();
    }

    public int getNumbersOfPages() {
        return numbersOfPages;
    }

    public void setNumbersOfPages(int numbersOfPages) {
        System.out.println("Please, enter numbers of pages: ");
        this.numbersOfPages = sc.nextInt();
    }
}
