package DS.Stack_Examples;

import java.util.*;

public class Stack_Demo 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st=new Stack<>();
     
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
     
        System.out.println(st);
        
        //System.out.println(st.pop());
        //System.out.println(st.pop());
        
        //System.out.println(st);
        
        //System.out.println(st.peek());
        
        // System.out.println(st);
        
        while(! st.isEmpty()) 
        {
            System.out.println(st.pop());
        }
        
        System.out.println(st);
        
    }
}
