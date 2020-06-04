package DS.LinkedList;

public class CircularLinkedList 
{
    Node START;

    public CircularLinkedList() 
    {
        START=null;
    }
    
    void addToList(int num)
    {
        Node nd=new Node(num);
        
        if(START==null)  // List is Empty, add as First Node
        {
            START=nd;
            nd.next=START;
            
            System.out.println(num+" added as first node");
        }
        else
        {
            Node t = START;
            
            while(t.next!=START)   // Traverse to Last Node
            {
                t=t.next;
            }
            
            t.next=nd;
            nd.next=START;
            
        }
    }

    
    void addToStart(int num)
    {
        Node nd=new Node(num);
        
        if(START==null)  // List is Empty, add as First Node
        {
            START=nd;
            nd.next=START;
            
            System.out.println(num+" added as first node");
        }
        else
        {
            Node t=START;
            
            while(t.next!=START)
            {
                t=t.next;
            }
            
            nd.next=START;
            START=nd;
            t.next=nd;
            
            System.out.println(num+" added at the begining");
        }
        
    }
    
    void delete(int num)
    {
        Node t = START;
        
        if(t.data == num)   // Found as First Node
        {
            if(t.next==START)   // There is only 1 node in list
            {
                START=null;
            }
            else
            {
               while(t.next!=START)   // Move t to last Node, then delete 1st node
               {
                  t=t.next;
               }
            
               START = START.next;
               t.next = START;
            
               System.out.println(num+" deleted as first node");
            }
        }
        else
        {
            boolean found=false;
            
            while(t.next!=START)        // stop at last node if not found
            {
                 if(t.next.data==num)   // match and stop 1 node before
                 {
                     found=true;
                     break;
                 }
                 
                 t=t.next;
            }
            
            if(found==false)
            {
                System.out.println("Cannot Delete"+ num+", element not found in the list");
            }
            else
            {
                t.next = t.next.next;
                
                System.out.println(num+" deleted from list");
            }
        }
    }
    
    
    void update(int old_val, int new_val)
    {
        if(START!=null)
        {
            
            Node t = START;
            
            boolean found=false;
            
            do
            {
                if(t.data==old_val)   // if matches, even at last node , break
                {
                    found=true;
                    break;
                }
                
                t=t.next;
            }
            while(t!=START);     //  if reaches START AGAIN, not found
            
            
            if(found)
            {
                t.data = new_val;
            }
            else
            {
                System.out.println("Cannot Update , number not found");
            }
            
        }
        else
        {
            System.out.println("Cannot Update, List is EMPTY");
        }
    }
    
    @Override
    public String toString() 
    {
       String ans="S -->";
    
       if(START==null)
       {
           
       }
       else
       {
       
         Node t=START;
       
         while(true)
         {
           ans=ans + t.data+" --> ";
           t=t.next;
           
           if(t==START)
           {
               break;
           }
         }
       
         ans=ans+"S";
       }
       
       return ans;
    }
   
}
