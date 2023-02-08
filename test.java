import java.util.*;

public class test{

    public static void main(String[] args) {
        
        System.out.println(testQueue());
    
    }
    
    
    public static String testQueue() throws EmptyCollectionException
    {
        String s;
        Queue<String> queue = new ArrayQueue<String>();
     
        queue.add("a");
        queue.add("b");
        s = queue.remove();
        queue.add("c");
        queue.add("d");
        s = queue.remove();
        s = queue.remove();
     
        return s;
    } 
    }