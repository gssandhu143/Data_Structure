package DS.LinkedList;

public class Testing_Circular_Linked_List 
{
    public static void main(String[] args) 
    {
       CircularLinkedList cl=new CircularLinkedList();
    
       cl.addToList(10);
       cl.addToList(20);
       cl.addToList(30);
       cl.addToList(40);
       cl.addToList(50);
       
       cl.addToStart(60);
       cl.addToStart(70);
       
       System.out.println(cl);
    
       cl.delete(70);
       //cl.delete(60);
       
       //cl.delete(50);
       
       //cl.delete(30);
       
       //cl.delete(100);
       
       cl.update(30,35);
       
       cl.update(50, 55);
       
       System.out.println(cl);
    }
    
}
