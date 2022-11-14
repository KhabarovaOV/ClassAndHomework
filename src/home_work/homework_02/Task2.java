package home_work.homework_02;

import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
       /* System.out.println("Орёл или решка: нажми ENTER");
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        int a = 1;
        int b = 2;
        int random_number1 = a + (int) (Math.random() * b);
        if (random_number1==1){
            System.out.println("Орёл");
        }
        else {
            System.out.println("Решка");
        }*/
        Task2 task2 = new Task2();
        for (int i = 0; i < 10; i++) {
            task2.coinflip();
        }
    }

    private int getRandomNumber(int from, int till){
        return (int) (from + Math.random()*till);
    }

    public void coinflip(){
        if (getRandomNumber(1,100)<=50){
            System.out.println("Tails");
        }else{
            System.out.println("Heads");
        }
    }

}