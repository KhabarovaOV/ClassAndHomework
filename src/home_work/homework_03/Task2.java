package home_work.homework_03;

public class Task2 {
    public static void main(String[] args) {
        int bit1 = Integer.parseInt("10101010", 2);
        int bit2 = Integer.parseInt("01010101", 2);

        System.out.println("bit1 = " + Integer.toBinaryString(bit1));
        System.out.println("bit2 = " + Integer.toBinaryString(bit2));
        System.out.println(Integer.toBinaryString(bit1 & bit2));
        System.out.println(Integer.toBinaryString(bit1 ^ bit2));
        System.out.println(Integer.toBinaryString(bit1 | bit2));
        System.out.println(Integer.toBinaryString(bit1 << bit2));
        System.out.println(Integer.toBinaryString(bit1 >> bit2));
        System.out.println(Integer.toBinaryString(bit1 >> 1));
        System.out.println(Integer.toBinaryString(bit2 >> 1));
        System.out.println(Integer.toBinaryString(1 << bit1));
        System.out.println(Integer.toBinaryString(1 << bit2));
    }
}
