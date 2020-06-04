package DS.Queue_Examples;

public class MyDeque<T> 
{
    private T a[];
    private int F,R, middle;

    public MyDeque() 
    {
        a= (T[]) new Object[10];
        
        F=-1;
        R=-1;
        middle = (a.length/2);
    }
    
    void addFromRear(T num)
    {
        if(R==a.length-1)
        {
            System.out.println("Rear Side is Full, Cannot add "+num);
        }
        else if(F==-1 && R==-1)
        {
            F=middle;
            R=middle;
            a[R]=num;
            
            System.out.println("First Element "+num+" added to Deque");
        }
        else
        {
            R=R+1;
            a[R]=num;
            System.out.println("Element "+num+" added from rear side");
        }
    }

    void addFromFront(T num)
    {
        if(F==0)
        {
            System.out.println("Queue FULL From Front Side, cannot add "+num);
        }
        else if(F==-1 && R==-1)
        {
            F=middle;
            R=middle;
            a[F]=num;
        }
        else
        {
            F=F-1;
            a[F]=num;
            System.out.println(num+" added from Front Side");
        }
    }
    
    void deleteFromRear()
    {
        if(F==-1 && R==-1)
        {
            System.out.println("Cannot Delete from Rear, Queue is EMPTY");
        }
        else if(F==R)
        {
            System.out.println(a[R]+" is deleted");
            F=-1;
            R=-1;
        }
        else
        {
            System.out.println(a[R]+" is deleted");
            R=R-1;
        }
    }
    
    void deleteFromFront()
    {
        if(F==-1 && R==-1)
        {
            System.out.println("Cannot delete, QUEUE EMPTY");
        }
        else if(F==R)
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
    
    @Override
    public String toString() 
    {
       String ans="[";
       
       if(F==-1 && R==-1)
       {
           
       }
       else
       {
           for(int i=F;i<=R;i++)
           {
               ans = ans + a[i]+" ";
           }
       }
       
       ans=ans+"]";
       
       return ans;
    }
   
}
