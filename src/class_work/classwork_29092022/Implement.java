package class_work.classwork_29092022;

public class Implement {

    public void getNameOfDay(Week day) {
        switch (day) {
            case MONDAY: {
                if (day.getNameOfDay().equals("Понедельник")) {
                    System.out.println("Текст верный " + day.getNameOfDay());
                } else {
                    System.out.println("Текст не верный: " + day.getNameOfDay());
                }
                break;
            }
            case TUESDAY: {
                if (day.getNameOfDay().equals("Вторник")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getNameOfDay());
                }
                break;
            }
            case WEDNESDAY: {
                if (day.getNameOfDay().equals("Среда")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getNameOfDay());
                }
                break;
            }
            case THURSDAY: {
                if (day.getNameOfDay().equals("Четверг")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getNameOfDay());
                }
                break;
            }
            case FRIDAY: {
                if (day.getNameOfDay().equals("Пятница")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getNameOfDay());
                }
                break;
            }
            case SATURDAY: {
                if (day.getNameOfDay().equals("Суббота")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getNameOfDay());
                }
                break;
            }
            case SUNDAY: {
                if (day.getNameOfDay().equals("Воскресенье")) {
                    System.out.println("Текст верный");
                } else {
                    System.out.println("Текст не верный: " + day.getNameOfDay());
                }
                break;
            }

        }
    }
}
