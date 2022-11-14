package class_work.classwork_10112022.mnogopotochnost.exemple;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SchetOne {
private int schetSumma = 2500;
//private Lock lock = new ReentrantLock();
public synchronized int getMyMoney(int summa){
   // lock.lock();
   if (schetSumma< summa){
        throw  new IllegalArgumentException("Ne dostatochno sredstv");
    }
    schetSumma -= summa;
    System.out.println("ja vzal " + summa);
    System.out.println("ostatok na schete " + schetSumma);
    //lock.lock();
    return summa;
}
}
