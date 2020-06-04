/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_imp;

public class Myqueue<G> {
  private  G a[];
   private int F,R;
    public Myqueue()
    {
       a=(G[]) new Object[100];
       F=-1;
       R=-1;
    }
    @Override
    public String toString()
    {
        if(F==-1 && R==-1)
        {
         return "[]";
        }
      String ans="[";
      for(int i=F;i<=R;i++)
      {
          ans=ans+a[i]+" ";
      }
      return ans+"]";
    }
    
    
    public void add(G n)
    {
        if(R==a.length-1)
        {
            System.out.println("Queue is Full");
        }
        else if(R==-1 && F==-1)
        {
            R++;
            F++;
            a[F]=n;
        }
        else
        {
            R++;
            a[R]=n;
        }
    }
    
    public G remove()
    { 
        if(R!=-1 && F!=1)
       {
           if(F==R)
        {
          G ans=a[F];
          F=-1;
          R=-1;
         return ans;
        }
        else
      { G ans=a[R];
          R--;
      return ans;
      }
        }
      return a[F];
    }
    
    boolean isEmpty()
    {
        if(F==-1 && R==-1)
        {
            return true;
        }
        return false;
    }
    
    int size()
    {  if(F==-1 && R==-1)
    {
        return 0;
    }
    else if(F==R)
    {
        return 1;
    }
        return R-F+1;
    }
    
}
