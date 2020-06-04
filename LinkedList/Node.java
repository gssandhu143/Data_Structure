package DS.LinkedList;

public class Node 
{ 
   int data; // Store data of this node
   Node next;   // Points to Next Node  
 
   public Node(int data)
   {
       this.data=data;
       next=null;
   }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

   
   
   @Override
   public String toString() 
   {  
        if(next==null)
        {
            return("(null)");
        }
        else
        {
            return("("+data+")");
        }
    }
   
}
