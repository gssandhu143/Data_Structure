package DS.LinkedList;

public class Testing_Double_LinkedList 
{
    public static void main(String[] args) 
    {
        My_Double_Linked_List dlist =  new My_Double_Linked_List();
        
        dlist.addtoList(10);
        dlist.addtoList(20);
        dlist.addtoList(30);
        dlist.addtoList(40);
        dlist.addtoList(50);
    
        System.out.println(dlist);
        
        System.out.println("");
        dlist.printFWD();
        
        dlist.printBACKWARD();
        
        dlist.update(30, 35);
        
        System.out.println(dlist);
        
        dlist.delete(35);
        dlist.delete(10);
        dlist.delete(50);
        
        
        System.out.println(dlist);
        
    }
    
    
}
