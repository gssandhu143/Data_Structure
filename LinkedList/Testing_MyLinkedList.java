package DS.LinkedList;

public class Testing_MyLinkedList 
{
    public static void main(String[] args)
    {
         MyLinkedList mylist=new MyLinkedList();
        
         mylist.addToList(10);
         mylist.addToList(20);
         mylist.addToList(30);
         mylist.addToList(40);
         mylist.addToList(50);
         mylist.addToList(60);
         mylist.addToList(70);
         mylist.addToList(90);
        
         mylist.addToList(100);
         mylist.addToList(110);
         mylist.addToList(120);
         mylist.addToList(130);
         
         mylist.addAsFirst(140);
         mylist.addAsFirst(150);
         
         System.out.println(mylist);
         
        
         System.out.println("number found at "+mylist.search(130));
         
         int l = mylist.size();
         
         System.out.println("SIZE OF LIST "+l);
         
         System.out.println(mylist.getDataAt(3));
         
         System.out.println("-------");
          
         mylist.insertAt(3, 77);

         System.out.println(mylist);
     
         mylist.updateAt(3, 88);
         
         System.out.println(mylist);
     
         mylist.deleteAt(3);
         
         System.out.println(mylist);
         
         mylist.deleteAt( mylist.size()-1 );
         
         System.out.println(mylist);
         
         System.out.println("Mid Element "+ mylist.getMiddleElementOfList() );
    
         mylist.printUsingRec( mylist.START.next );
    
         System.out.println("\n");
         
         mylist.reversePrintUsingRec( mylist.START.next );
         
         System.out.println("\n");
         
         MyLinkedList mylist2 = mylist.reverseList();
         
         System.out.println(mylist2);
         
         
    }
}
