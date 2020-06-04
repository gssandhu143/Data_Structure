package DS.Queue_Examples;

import java.util.ArrayDeque;

public class Deque_Demo 
{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);
        dq.addLast(50);
        
        System.out.println(dq);
        
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeFirst());
        
        System.out.println(dq);
       
    }
}
