package class_work.classwork_27102022;

public class Main {
    public static void main(String[] args) {
        Zoo <Aviary> zoo = new Zoo<>();

        Aviary<Tiger> tigerAviary = new Aviary<>();
        Tiger t1 = new Tiger();
        tigerAviary.setAnimal(t1);

        Aviary<Hamster> hamsterAviary = new Aviary<>();
        Hamster h1 = new Hamster();
        hamsterAviary.setAnimal(h1);

        Aviary<Pegasus> pegasusAviary = new Aviary<>();
        Pegasus p1 = new Pegasus();
        pegasusAviary.setAnimal(p1);

        zoo.addAnimal(tigerAviary);
        zoo.addAnimal(hamsterAviary);
        zoo.addAnimal(pegasusAviary);

        for (Aviary x: zoo.getAviary()
             ) {
            System.out.println(x.toString());
        }
    }
}
