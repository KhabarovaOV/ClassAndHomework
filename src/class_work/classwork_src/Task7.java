package class_work.classwork_src;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву: ");
        String simvol = sc.nextLine();
        Pattern patlatletter = Pattern.compile("[a-zA-Z]{1}");
        Matcher matlatletter = patlatletter.matcher(simvol);
        Pattern patkirletter = Pattern.compile("[а-яА-Я]{1}");
        Matcher matkirletter = patkirletter.matcher(simvol);

        if(matlatletter.matches()==true)
        {
            System.out.println("Латиница");
        }
        if(matkirletter.matches()==true)
        {
            System.out.println("Кирилица");
        }

    }
}
