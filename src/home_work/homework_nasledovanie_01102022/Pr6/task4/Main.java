package home_work.homework_nasledovanie_01102022.Pr6.task4;

public class Main {
    public static void main(String[] args) {
        Amphibian one = new Frog();
        Object obj = new Frog();
        Amphibian three = new Triton();

        Amphibian amphibian = (Amphibian) obj;
        Frog two = (Frog) amphibian;
        Frog four = (Frog) amphibian;

        one.moveInWater();
        one.moveOnLand();
        two.sayKva();
        three.moveInWater();
        three.moveOnLand();
        four.sayKva();
    }
}
