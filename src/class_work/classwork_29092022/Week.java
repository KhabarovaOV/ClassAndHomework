package class_work.classwork_29092022;

public enum Week {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String nameOfDay;

    Week(String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }

    String getNameOfDay() {
        return nameOfDay;
    }
}
