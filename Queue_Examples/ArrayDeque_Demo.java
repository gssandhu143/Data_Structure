package DS.Queue_Examples;

import java.util.ArrayDeque;

public class ArrayDeque_Demo 
{
    public static void main(String[] args) 
    {
        
        ArrayDeque<Integer> dq=new ArrayDeque();
    
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        
        dq.addFirst(40);
        dq.addFirst(50);
        dq.addFirst(60);
       
        System.out.println(dq);
       
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeFirst());
        
        System.out.println(dq.removeLast());
        System.out.println(dq.removeLast());
        
        
    }
}
