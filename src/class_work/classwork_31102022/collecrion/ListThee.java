package class_work.classwork_31102022.collecrion;

import java.util.HashSet;

public class ListThee {
HashSet<String> hashSet = new HashSet<>();

    public static void main(String[] args) {
     ListThee listThee = new ListThee();
     listThee.createdHashSet();
     listThee.watchedHashSetList();
     listThee.addedNewString();
        System.out.println();
        listThee.watchedHashSetList();
    }
    public void createdHashSet(){
        hashSet.add("a");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("j");
        hashSet.add("e");
        hashSet.add("k");
        hashSet.add(null);
    }
    public void watchedHashSetList() {
        for (String i : hashSet) {
            System.out.println(i);
        }
    }

    public void addedNewString(){
        hashSet.add("f");
    }

}
