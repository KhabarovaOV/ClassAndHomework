package class_work.classwork_31102022.collecrion;


import java.util.ArrayList;
import java.util.List;

public class ListOne {
    List<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        ListOne arr = new ListOne();
        arr.createdArrayList();
        arr.watchedArrayList();
        arr.addedNewNumber();
        System.out.println();
        arr.watchedArrayList();
    }

    public void createdArrayList() {
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(null);
    }

    public void watchedArrayList() {
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }

    public void addedNewNumber() {
        arrayList.add(2, 4);
    }

}
