package DS.Stack_Examples;

public class MyStack_Gen<T> 
{
   private T a[];
   
   private int TOP;

   public MyStack_Gen(int n) 
   {
       a = (T[]) new Object[n];
       TOP = -1;
   }

   void push(T num)
   {
       if(TOP==a.length-1)
       {
           System.out.println("Stack Already Full, Cannot Push "+num);
       }
       else
       {
         TOP++;
         a[TOP]=num;
         System.out.println(num+" pushed to stack");
       }
   }
   
   void pop()
   {
       if(TOP==-1)
       {
           System.out.println("Cannot POP, STACK IS EMPTY");
       }
       else
       {
           System.out.println(a[TOP]+" is popped !!!");
           TOP--;
       }
       
       //return a[TOP--];
   }
  
   
   boolean isEmpty()
   {
       if(TOP==-1)
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
       
       for(int i=0;i<=TOP;i++)
       {
           ans=ans + a[i]+" ";   
       }
       
       ans=ans+"]";
       
       return ans;
    }
    
}
