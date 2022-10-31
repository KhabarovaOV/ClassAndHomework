package class_work.classwork_27102022;

import java.util.ArrayList;
import java.util.List;

public class Zoo <E>{
    List<E> aviary;
    public Zoo (){
        this.aviary = new ArrayList<>();
    }

    public void addAnimal(E animal){
        aviary.add(animal);
    }
    public List <E> getAviary(){
        return aviary;
    }
}
