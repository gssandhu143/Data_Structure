package DS.Queue_Examples;

public class MyQueue 
{
    private int a[];
    private int F,R;

    public MyQueue(int n) 
    {
       a = new int[n];
       F = -1;
       R = -1;
       
       System.out.println("MyQueue is Created");
    }
    
    void add(int num)  // add from Rear
    {
        if(  R == (a.length-1))
        {
            System.out.println("Queue Already FULL, cannot add");
        }
        else
        {
            if(F==-1 && R==-1)
            {
               F=0;
               R=0;
               a[R]=num;
                System.out.println(num+" added as First Element in Queue");
            }
            else
            {
               R=R+1;
               a[R]=num;
               System.out.println(num+" is added to queue");
            }
        }
    }
    
    void delete()     // delete from front
    {
        if(F==-1 && R==-1)
        {
            System.out.println("** Cannot Delete, Queue is EMPTY **");
        }
        else
        {
            if(F==R)  // only single element is there in queue
            {
                System.out.println(a[F]+" is deleted");
                F=-1;
                R=-1;
            }
            else
            {
                System.out.println(a[F]+" is deleted");
                F=F+1;
            }
        }
    }

    boolean isEmpty()
    {
        if(F==-1 && R==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
                
    }
    
    @Override
    public String toString()    
    {
       String ans="[";
       
       if(F==-1 && R==-1)
       {
           ans = ans + " -- QUEUE EMPTY --";
       }
       else
       {
         for(int i=F;i<=R;i++)
         {
           ans = ans + a[i] +" ";
         }
       }
       
       ans=ans+"]";
       
       return ans;
    }
    
    
}
