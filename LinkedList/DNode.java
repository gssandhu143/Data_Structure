package DS.LinkedList;

public class DNode
{
    int data;
    DNode next;
    DNode prev;
            
    public DNode(int data)
    {
        this.data = data;
    }

    @Override
    public String toString() {
       
        return "("+data+")";
    
    }
    
    
}
