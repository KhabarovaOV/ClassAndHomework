package class_work.classwork_22092022;

public class Main {
    public static void main(String[] args) {
        City vitebsk = new City();
        vitebsk.setName("Vitebsk");
        vitebsk.setCountry("Belarus");
        vitebsk.setCountOfPeople(15000);

        City london = new City();
        london.setName("London");
        london.setCountry("USA");
        london.setCountOfPeople(32000);

        City moscow = new City();
        moscow.setName("Moscow");
        moscow.setCountry("Russia");
        moscow.setCountOfPeople(2000000);

        Country russia = new Country();
        russia.setContinent("Eurasia");
        russia.setName("Russia");

        Country usa = new Country();
        usa.setName("USA");
        usa.setContinent("America");

        System.out.println(vitebsk.toString());
        System.out.println(london.toString());
        System.out.println(moscow.toString());
        System.out.println(russia.toString());
        System.out.println(usa.toString());
    }

}
