package class_work.classwork_13102022.task1;

import java.util.LinkedList;
import java.util.List;

public class OutOfMemoryError extends Throwable {
    public static void main(String[] argv)
            throws Exception
    {
        List<Object> fixedData = consumeAvailableMemory();
        while (true)
        {
            Object data = new byte[64 * 1024 - 1];
        }
    }


    private static List<Object> consumeAvailableMemory()
            throws Exception
    {
        LinkedList<Object> holder = new LinkedList<Object>();
        while (true)
        {
            holder.add(new byte[128 * 1024]);
        }
    }
}
