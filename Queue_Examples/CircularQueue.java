package DS.Queue_Examples;

public class CircularQueue 
{
    private int a[];
    private int F,R;

    public CircularQueue()
    {
        a=new int[5];
    
        F=-1;
        R=-1;
    }
    
    void insert(int num)
    {
        if( (R+1)%a.length == F )
        {
            System.out.println("Queue is FULL, Cannot add");
        }
        else if(F==-1 & R==-1)   
        {
            F=0;
            R=0;
            
            a[R] = num;
            
            System.out.println("First Item "+num+" added to Queue");
        }
        else
        {
              R= (R+1) % a.length;
              a[R]=num;
              System.out.println(num+" added to queue");
        }
    }
    
    void delete()
    {
       if(F==-1 && R==-1)
       {
           System.out.println("Cannot delete, queue empty");
       }
       else if(F==R)   // only single element in queue
       {
           System.out.println(a[F]+" is deleted");
           F=-1;
           R=-1;
       }
       else
       {
           System.out.println(a[F]+" is deleted");
           F= (F+1)%a.length;
       }
       
    }

    @Override
    public String toString() 
    {
        String ans="["; 
        
        if(F==-1 && R==-1)
        {
           ans += " -- EMPTY -- ";
        }
        else
        {
            if(F<R)
            {
              for(int i=F;i<=R;i++)
              {
                 ans = ans + a[i]+ " "; 
              }
            }
            else
            {
                for(int i=F;i<=a.length-1;i++)
                {
                    ans = ans + a[i]+ " "; 
                }
                
                for(int i=0;i<=R;i++)
                {
                    ans = ans + a[i]+ " ";
                }
            }
        }
        
        ans=ans+"]";
        
        return ans;
    }
}
