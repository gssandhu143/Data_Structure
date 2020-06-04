package DS.Queue_Examples;

public class Testing_MyQueue 
{
    public static void main(String[] args) 
    {
        MyQueue q1=new MyQueue(5);
        
        System.out.println(q1);
    
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        
        q1.add(60);
        q1.add(70);
        
        /*
        q1.delete();
        q1.delete();
        q1.delete();
        q1.delete();
        q1.delete();
        
        q1.delete();
        */         

        while(! q1.isEmpty() )
        {
            q1.delete();
        }
        
        System.out.println(q1);
        
    }
}
