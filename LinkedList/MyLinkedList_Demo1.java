package DS.LinkedList;

// Here we are manually connecting nodes
// no linked list class is there

public class MyLinkedList_Demo1 
{
    public static void main(String[] args) 
    {
        
        Node n1=new Node(10);
        
        Node n2=new Node(20);
        
        Node n3=new Node(30);
    
        Node n4=new Node(40);
        
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        
        System.out.println(n1);
        
        System.out.println(n2);
        
        System.out.println(n3);
        
        System.out.println(n4);
        
        
        
        
    }
    
}
