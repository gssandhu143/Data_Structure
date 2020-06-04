package DS.LinkedList;

import java.util.*;

public class LL_Demo1 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> ll=new LinkedList<>();
        
        ll.addLast(new Integer(10));
        ll.addLast(new Integer(20));
        
        ll.addLast(new Integer(30));
        
        ll.addLast(40);
        ll.add(100);
        
        //ll.addFirst(50);
        
        //ll.remove(2);
        
        ll.remove(new Integer(30));
        
        System.out.println(ll);
    
    }
    
}
