package class_work.classwork_31102022.collecrion;

import java.util.LinkedList;
import java.util.List;

public class ListTwo {
    List<Double> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        ListTwo listTwo = new ListTwo();
        listTwo.createdLinkedList();
        listTwo.watchedLinkedList();
        listTwo.addedNewNumber();
        System.out.println();
        listTwo.watchedLinkedList();
    }
    public void createdLinkedList(){
        linkedList.add( 2.4);
        linkedList.add(null);
        linkedList.add(3.5);
        linkedList.add(2.8);
        linkedList.add(1.5);
        linkedList.add(null);
    }

    public void watchedLinkedList() {
        for (Double i : linkedList) {
            System.out.println(i);
        }
    }

    public void addedNewNumber() {
        linkedList.add(3, 4.0);
    }
}
