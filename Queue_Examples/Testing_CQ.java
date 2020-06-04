package DS.Queue_Examples;

public class Testing_CQ 
{
    public static void main(String[] args) 
    {
        CircularQueue cq=new CircularQueue();
        
        System.out.println(cq);
        
        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.insert(40);
        cq.insert(50);
        
        //cq.insert(60);
       
        System.out.println(cq);
       
        cq.delete();
        cq.delete();
        
        System.out.println(cq);
        
        cq.insert(70);
        cq.insert(80);
        
        System.out.println(cq);
        
    }
}
