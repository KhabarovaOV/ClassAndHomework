package class_work.classwork_src;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день рождения: ");
        int d = sc.nextInt();
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите месяц рождения: ");
        byte m = sc.nextByte();
        Scanner scnn = new Scanner(System.in);
        System.out.println("Введите год рождения: ");
        int g = sc.nextInt();

        switch (m){
            case (3): {
                if (d >= 21 && d < 32) {
                    System.out.println("Знак зодиака: Овен");
                } else {
                    System.out.println("Знак зодиака: Рыбы");
                }
                break;
            }
            case (4): {
                if (d >= 21 && d < 31) {
                    System.out.println("Знак зодиака: Телец");
                } else {
                    System.out.println("Знак зодиака: Овен");
                }
                break;
            }
            case (5): {
                if (d >= 22 && d < 32) {
                    System.out.println("Знак зодиака: Близнецы");
                } else {
                    System.out.println("Знак зодиака: Телец");
                }
                break;
            }
            case (6): {
                if (d >= 22 && d < 31) {
                    System.out.println("Знак зодиака: Рак");
                } else {
                    System.out.println("Знак зодиака: Близнецы");
                }
                break;
            }
            case (7): {
                if (d >= 24 && d < 32) {
                    System.out.println("Знак зодиака: Лев");
                } else {
                    System.out.println("Знак зодиака: Рак");
                }
                break;
            }
            case (8): {
                if (d >= 24 && d < 32) {
                    System.out.println("Знак зодиака: Дева");
                } else {
                    System.out.println("Знак зодиака: Рак");
                }
                break;
            }
            case (9): {
                if (d >= 24 && d < 31) {
                    System.out.println("Знак зодиака: Весы");
                } else {
                    System.out.println("Знак зодиака: Дева");
                }
                break;
            }
            case (10): {
                if (d >= 24 && d < 32) {
                    System.out.println("Знак зодиака: Скорпион");
                } else {
                    System.out.println("Знак зодиака: Весы");
                }
                break;
            }
            case (11): {
                if (d >= 23 && d < 31) {
                    System.out.println("Знак зодиака: Стрелец");
                } else {
                    System.out.println("Знак зодиака: Скорпион");
                }
                break;
            }
            case (12): {
                if (d >= 22 && d < 32) {
                    System.out.println("Знак зодиака: Козерог");
                } else {
                    System.out.println("Знак зодиака: Стрелец");
                }
                break;
            }
            case (1): {
                if (d >= 21 && d < 32) {
                    System.out.println("Знак зодиака: Водолей");
                } else {
                    System.out.println("Знак зодиака: Козерог");
                }
                break;
            }
            case (2): {
                if (d >= 20 && d < 32) {
                    System.out.println("Знак зодиака: Рыбы");
                } else {
                    System.out.println("Знак зодиака: Козерог");
                }
                break;
            }
        }
        switch (g) {
            case (1920):
            case (1932):
            case (1944):
            case (1956):
            case (1968):
            case (1980):
            case (1992):
            case (2004):
            case (2016): {
                System.out.println("Год: Обезьяна");
                break;
            }
            case (1921):
            case (1933):
            case (1945):
            case (1957):
            case (1969):
            case (1981):
            case (1993):
            case (2005):
            case (2017):  {
                System.out.println("Год: Петух");
                break;
            }
            case (1922):
            case (1934):
            case (1946):
            case (1958):
            case (1970):
            case (1982):
            case (1994):
            case (2006):
            case (2018):     {
                System.out.println("Год: Собака");
                break;
            }
            case (1923):
            case (1935):
            case (1947):
            case (1959):
            case (1971):
            case (1983):
            case (1995):
            case (2007):
            case (2019):   {
                System.out.println("Год: Свинья");
                break;
            }
            case (1924):
            case (1936):
            case (1948):
            case (1960):
            case (1972):
            case (1984):
            case (1996):
            case (2008):
            case (2020):    {
                System.out.println("Год: Крыса");
                break;
            }
            case (1925):
            case (1937):
            case (1949):
            case (1961):
            case (1973):
            case (1985):
            case (1997):
            case (2009):
            case (2021): {
                System.out.println("Год: Бык");
                break;
            }
            case (1926):
            case (1938):
            case (1950):
            case (1962):
            case (1974):
            case (1986):
            case (1998):
            case (2010):
            case (2022): {
                System.out.println("Год: Тигр");
                break;
            }
            case (1927):
            case (1939):
            case (1951):
            case (1963):
            case (1975):
            case (1987):
            case (1999):
            case (2011):
            case (2023):{
                System.out.println("Год: Кота(Кролика)");
                break;
            }
            case (1928):
            case (1940):
            case (1952):
            case (1964):
            case (1976):
            case (1988):
            case (2000):
            case (2012):
            case (2024): {
                System.out.println("Год: Дракон");
                break;
            }
            case (1929):
            case (1941):
            case (1953):
            case (1965):
            case (1977):
            case (1989):
            case (2001):
            case (2013):
            case (2025): {
                System.out.println("Год: Змея");
                break;
            }
            case (1930):
            case (1942):
            case (1954):
            case (1966):
            case (1978):
            case (1990):
            case (2002):
            case (2014):
            case (2026): {
                System.out.println("Год: Лошадь");
                break;
            }
            case (1931):
            case (1943):
            case (1955):
            case (1967):
            case (1979):
            case (1991):
            case (2003):
            case (2015):
            case (2027): {
                System.out.println("Год: Коза(Овца)");
                break;
            }
        }
    }
}
