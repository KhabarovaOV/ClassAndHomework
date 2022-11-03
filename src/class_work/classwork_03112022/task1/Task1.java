package class_work.classwork_03112022.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    List<Integer> arrayList = new ArrayList<>();
    HashMap<Integer, String> numberOfVarious = new HashMap<>();

    public void createdMap() {
        numberOfVarious.put(1, "Добавить элемент в список");
        numberOfVarious.put(2, "Удалить элемент из списка");
        numberOfVarious.put(3, "Показать содержимое списка");
        numberOfVarious.put(4, "Проверить есть ли значение в списке");
        numberOfVarious.put(5, "Заменить значение в списке");
        numberOfVarious.put(6, "Выход");
        System.out.println(numberOfVarious);
        variousOfDo();
    }

    public int getMenuPoint() {
        return scan();
    }

    private void variousOfDo() {
        int menuPoint = getMenuPoint();
        switch (menuPoint) {
            case 1:
                addNewNumber();
                createdMap();
                ;
            case 2:
                deleteElement();
                createdMap();
                ;
            case 3:
                watchList();
                createdMap();
                ;
            case 4:
                chekList();
                createdMap();
                ;
            case 5:
                changedElement();
                createdMap();
                ;
            case 6:
                System.out.println("Программа завершена!");
                break;
            default:
        }
    }

    public int scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void createdList() {
        arrayList.add(scan());
    }


    public void addNewNumber() {
        scan();
        arrayList.add(scan());
    }

    public void deleteElement() {
        System.out.println("Выберете номер элемента, который хотите удалить: ");
        scan();
        arrayList.remove(scan());
    }

    public void watchList() {
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }

    public void chekList() {
        scan();
        boolean contains = arrayList.contains(scan());
        System.out.println(contains);
    }

    public void changedElement(){
        System.out.println("Введите порядковый номер элемента, который хотите удалить: ");
        Scanner scannerOne = new Scanner(System.in);
        Integer k = scannerOne.nextInt();
        System.out.println("Введите значение нового номера: ");
        Scanner scannerTwo = new Scanner(System.in);
        Integer i = scannerTwo.nextInt();
        arrayList.set(k, i);
    }
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println("Введите числа: ");
        task1.createdList();
        System.out.println("Выберете пункт из меню: ");
        task1.createdMap();

    }

}



