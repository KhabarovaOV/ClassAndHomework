package class_work.classwork_17102022.task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] arr1 = {1, 5, 6, 7, 9, 8};
        int[] arr2 = {2, 8, 6};
        int[] arr3 = null;

        Task3 task3 = new Task3();
        task3.exeptionArrays(arr1, 5, 2, arr2, 0, 2);
        task3.exeptionArrays(arr1, 5, 12, arr2, 0, 2);
        task3.exeptionArrays(arr1, 1, 2, arr3, 0, 2);
    }

    public void exeptionArrays(int[] a, int aFromIndex, int aToIndex,
                               int[] b, int bFromIndex, int bToIndex) {

        try {
            Arrays.compare(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex);
        } catch (IllegalArgumentException e) {
            System.err.println("Hello error IllegalArgumentException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Hello error ArrayIndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.err.println("Hello error NullPointerException");
        }
    }
}

