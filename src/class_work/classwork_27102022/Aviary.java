package class_work.classwork_27102022;

public class Aviary <E>{
    private E animal;
    public void setAnimal(E animal){
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Aviary " +
                "animal = " + animal;
    }
}
