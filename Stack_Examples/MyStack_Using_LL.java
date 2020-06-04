package DS.Stack_Examples;

import DS.LinkedList.Node;

class MyStack_Using_LL 
{
    Node TOP;

    public MyStack_Using_LL() 
    {
         TOP=null;
    }

    void push(int num)
    {
        Node nd=new Node(num);
        
        if(isEmpty())    // we are pushing first node
        {
            TOP=nd;
            System.out.println(nd.getData() +"pushed to stack as first element");
        }
        else
        {
            //nd.next=TOP;
            
            nd.setNext(TOP);
            TOP=nd;
            
            System.out.println(nd.getData()+" pushed to stack");
        }
    }
    
    
    boolean isEmpty()
    {
        if(TOP==null)
            return true;
        else
            return false;
    }
    
    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Cannot Pop, Stack is EMPTY");
        }
        else
        {
            System.out.println( TOP.getData()+" is Popped  !!!" );
            TOP=TOP.getNext();
        }
    }
    
    public String toString()
    {
        String ans="";
        
        if(TOP==null)
        {
            ans="-- STACK is EMPTY --";
        }
        else
        {
            ans=ans+"TOP --> ";
            
            Node t=TOP;
            while(t!=null)
            {
                
                ans = ans +  t.getData() +"\n";
                ans = ans + "\t";
                
                t=t.getNext();
            }
        }
        
        return ans;
    }
    
}
