package DS.Queue_Examples;

public class Testing_MyDeque 
{
    public static void main(String[] args) 
    {
        MyDeque<Integer> dq=new MyDeque();
        
        dq.addFromRear(10);
        dq.addFromRear(20);
        dq.addFromRear(30);
        
       
        dq.addFromFront(40);
        dq.addFromFront(50);
        dq.addFromFront(60);
       
        System.out.println(dq);
        
        dq.deleteFromRear();
        dq.deleteFromRear();
        dq.deleteFromRear();
        
        dq.deleteFromFront();
        dq.deleteFromFront();
        dq.deleteFromFront();
        
        
        System.out.println(dq);
        
    }
    
}
