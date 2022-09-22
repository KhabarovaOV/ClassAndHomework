package home_work.homework_03;

public class Task1 {
    public static void main(String[] args) {
        double inf = 1.0 / 0.0;
        double negif = -1.0 / 0.0;
        double negzero = -1.0 / inf;
        double plszero = 1.0 / inf;
        double NaN1 = 0.0 / 0.0;
        double NaN2 = 0.0 * inf;
        System.out.println("inf = " + inf);
        System.out.println("negif = " + negif);
        System.out.println("inf == neginf is " + (inf == negif));
        System.out.println("\nnegzero = " + negzero);
        System.out.println("plszero = " + plszero);
        System.out.println("negzero == plszero is " + (negzero == plszero));
        System.out.println("\nNaN1 = " + NaN1);
        System.out.println("NaN2 = " + NaN2);
        System.out.println("NaN1 == NaN2 is " + (NaN1 == NaN2));
        System.out.println("NaN1 != NaN2 is " + (NaN1 != NaN2));
        double de = 0.125e4;
        System.out.println("\nde = " + de);
        double he = 0xFp2;
        System.out.println("he = " + he);
        double a = 5.0;
        double b = 3.0;
        System.out.println("\na = " + a + " b = " + b);
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a = ((long)(a/b))*b+(a%b) = " + (((long) (a / b)) * b + (a % b)));
        double sqrt = Math.sqrt(a);
        System.out.println("\nКвадратный корень из " + a + " равен " + sqrt);

        float inf1 = 1.0F / 0.0F;
        float negif1 = -1F/ 0F;
        float negzero1 = -1F / inf1;
        float plszero1 = 1F / inf1;
        float NaN3 = 0F / 0F;
        float NaN4 = 0F * inf1;
        System.out.println("inf1 = " + inf1);
        System.out.println("negif1 = " + negif1);
        System.out.println("inf1 == neginf1 is " + (inf1 == negif1));
        System.out.println("\nnegzero1 = " + negzero1);
        System.out.println("plszero1 = " + plszero1);
        System.out.println("negzero1 == plszero1 is " + (negzero1 == plszero1));
        System.out.println("\nNaN3 = " + NaN3);
        System.out.println("NaN4 = " + NaN4);
        System.out.println("NaN3 == NaN4 is " + (NaN3 == NaN4));
        System.out.println("NaN3 != NaN4 is " + (NaN3 != NaN4));
        float de1 = 0.125e4F;
        System.out.println("\nde1 = " + de1);
        float he1 = 0xFp2F;
        System.out.println("he1 = " + he1);
        float a1 = 5F;
        float b1 = 3F;
        System.out.println("\na1 = " + a1 + " b1 = " + b1);
        System.out.println("a1 / b1 = " + (a1 / b1));
        System.out.println("a1 % b1 = " + (a1 % b1));
        System.out.println("a1 = ((long)(a1/b1))*b1+(a1%b1) = " + (((long) (a1 / b1)) * b1 + (a1 % b1)));
        float sqrt1 = (float) Math.sqrt(a1);
        System.out.println("\nКвадратный корень из " + a1 + " равен " + sqrt1);
    }
}
