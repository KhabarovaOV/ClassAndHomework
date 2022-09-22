package class_work.classwork_01082022;

public class Task6 {
    public static void main(String[] args) {
        int a = 0;
        for (int i =0; i<=99999; i++){
            String str = String.valueOf(i);
            if(str.indexOf('4')!=-1){
                a++;
            }
            else {
                if (str.indexOf('1')!=-1 & str.indexOf('1')+1==str.indexOf('3')){
                    a++;
                }
            }
        }
        System.out.println("I need to exclude " + a + " numbers");
    }
}
