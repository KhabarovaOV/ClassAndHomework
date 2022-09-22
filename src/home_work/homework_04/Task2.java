package home_work.homework_04;

public class Task2 {
    public static void main(String[] args) {
        String[][] arrayStudents = {
                {"Корнышев", "Роман", "10"},
                {"Шайко", "Елена", "10"},
                {"Пономаренко", "Дарина", "10"},
                {"Понаськова", "Ирина", "10"},
                {"Зубрякова", "Маргарита", "9"},
                {"Кругликов", "Павел", "9"},
                {"Щербицкий", "Андрей", "9"},
                {"Кузьмич", "Любовь", "9"},
                {"Линов", "Михаил", "8"},
                {"Шабанова", "Кристина", "8"},
                {"Хабарова", "Ольга", "8"},
                {"Бондарева", "Анна", "8"}

        };

        Task2 studentsFindMaxMark = new Task2();

        studentsFindMaxMark.showArray(arrayStudents);
        int maxMarkOfStudent = studentsFindMaxMark.findMaxMark(arrayStudents);
        System.out.println();
        System.out.println("Студунты с максимальной оценкой:");
        studentsFindMaxMark.showStudentWithMaxMark(maxMarkOfStudent, arrayStudents);
    }

    public void showStudentWithMaxMark(int maxMarkStudent, String[][] arrayStudents) {
        for (int line = 0; line < arrayStudents.length; line++) {
            for (int column = 0; column < arrayStudents[line].length; column++) {
                if (column == arrayStudents[line].length - 1) {
                    int currentMarkOfStudent = Integer.parseInt(arrayStudents[line][column]);
                    if (currentMarkOfStudent == maxMarkStudent) {
                        for (int i = 0; i < arrayStudents[line].length; i++) {
                            System.out.print(arrayStudents[line][i] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }

    public int findMaxMark(String[][] arrayStudents) {
        int maxMarkStudent = 0;
        for (int line = 0; line < arrayStudents.length; line++) {
            for (int column = 0; column < arrayStudents[line].length; column++) {
                if (column == arrayStudents[line].length - 1) {
                    int currentMarkOfStudent = Integer.parseInt(arrayStudents[line][column]);
                    if (currentMarkOfStudent > maxMarkStudent) {
                        maxMarkStudent = currentMarkOfStudent;
                    }
                }
            }
        }
        return maxMarkStudent;
    }

    public void showArray(String[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[line].length; column++) {
                System.out.print(array[line][column] + " ");
            }
            System.out.println();
        }
    }
}

