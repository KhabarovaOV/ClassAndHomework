package class_work.classwork_10112022.mnogopotochnost.exemple;

public class SchetOne {
private int schetSumma = 2500;
public synchronized int getMyMoney(int summa){
   if (schetSumma< summa){
        throw  new IllegalArgumentException("Ne dostatochno sredstv");
    }
    schetSumma -= summa;
    System.out.println("ja vzal " + summa);
    System.out.println("ostatok na schete " + schetSumma);
    return summa;
}
}
