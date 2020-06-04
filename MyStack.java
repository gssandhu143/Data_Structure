/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS_imp;



public class MyStack<G> {
  private  G a[];
    private int b;
    
    public MyStack()
    {
         a=(G[]) new Object[500];
        b = -1;
    }
    
    @Override
    public String toString()
    {
        String ans="[";
        for(int i=0;i<=b;i++)
        {
            ans=ans+a[i]+" ";
            
        }
        ans=ans+"]";
        return ans;
    }
   public void push(G n)
    {
        if(b==a.length-1)
        {
            System.out.println("Stack OverFlow");
        }
        else
        {
            b++;
            a[b]=n;
        }
    }
    
    public G pop()
    {   
        if(b==-1)
        {
            System.out.println("UnderFlow");
            
        }
        else{
        
            G s=a[b];
            b--;
         
           return s;
        }
       return a[b];
    }
    
    boolean isEmpty()
    {
        if(b==-1)
        {
            return true;
        }
        return false;
    }
    
    
}
