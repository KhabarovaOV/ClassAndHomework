package class_work.classwork_01082022;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text : ");
        String text1 = scanner.nextLine();
        String a = text1;
        String replStr1 = a.replace('1', '_');
        String replStr2 = replStr1.replace('2', '_');
        String replStr3 = replStr2.replace('3', '_');
        String replStr4 = replStr3.replace('4', '_');
        String replStr5 = replStr4.replace('5', '_');
        String replStr6 = replStr5.replace('6', '_');
        String replStr7 = replStr6.replace('7', '_');
        String replStr8 = replStr7.replace('8', '_');
        String replStr9 = replStr8.replace('9', '_');
        char[] chars = replStr9.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }


        }


        System.out.println(new String(chars));
    }

}
