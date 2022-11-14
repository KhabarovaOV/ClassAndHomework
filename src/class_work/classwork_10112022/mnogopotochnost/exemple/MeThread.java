package class_work.classwork_10112022.mnogopotochnost.exemple;

public class MeThread extends Thread{
    private static SchetOne schetOne = new SchetOne();

    @Override
    public void run() {
        super.run();
    }

    public int getSumm(int sum){
        return schetOne.getMyMoney(sum);
    }
}
