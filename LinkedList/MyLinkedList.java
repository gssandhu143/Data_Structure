package DS.LinkedList;

public class MyLinkedList 
{
   Node START;

   public MyLinkedList() 
   {
       START=new Node(-1);
       START.next=null;
   }

   
   void addToList(int num)
   {
       // Logic to add new node to LinkedList
       Node nd=new Node(num);
       
       if(START.next==null)    
       {
           START.next = nd;
           System.out.println( nd.data +" added as First Node to list ");
       }
       else  // Move fwd and find last node and attach new node
       {
           Node t = START.next;
           
           while(t.next!=null)
           {
               t=t.next;
           }
           
           // Attach new Node Here
           t.next = nd;
           
           System.out.println(nd.data+ " added next to "+t.data);
       }
       
       
   }
   
   
   void addAsFirst(int num)
   {
       Node nd=new Node(num);
       
       nd.next=START.next;
       START.next=nd;
       
       System.out.println(nd.data+" Added as First Node");
   }
   
   
    int search(int num)
    {
        if(START.next==null)
        {
            return -1;
        }
        else
        {
           Node t = START.next;
        
           int count=0;
           
           while(t!=null)
           {
               if(t.data==num)
               {
                   return count;
               }
               else
               {
                   count++;
                   t=t.next;
               }
           }
           
           return -1;
           
        }
    }
   
    int size()
    {
        int count=0;
     
        if(START.next==null)
        {
            return count;
        }
        else
        {
           Node t = START.next;
           
           while(t!=null)
           {
               count++;
               t=t.next;
           }
           
           return count;
        }
        
    }
    
    int getDataAt(int index)
    {
        if( index<0 || index >= size() )
        {
            try
            {
               throw new Exception("Index is out of range");
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            
            return -1;
        }
        else
        {
            Node t = START.next;
            
            int i=0;
            
            while(t!=null)
            {
                if(i==index)
                {
                    return t.data;
                }
                
                i++;
                t=t.next;
            }
            
            return -1;
            
        }
    }
    
    
    void insertAt(int index, int num)
    {
        if( index<0 || index >= size() )
        {
            try
            {
               throw new Exception("Index is out of range");
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(index==0)
        {
            addAsFirst(num);
        }
        else
        {
            int i=0;
            
            Node t = START.next;
            
            while(true)
            {
              if(index-1==i)
              {
                break;
              }
              
              i++;
              t=t.next;
            }
            
            Node nd=new Node(num);
            
            nd.next = t.next;
            t.next = nd; 
            
            System.out.println(num+" inserted at index "+index);
        }
    }
    
    
    void updateAt(int index, int num)
    {
        if( index<0 || index >= size() )
        {
            try
            {
               throw new Exception("Index is out of range");
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else
        {
            Node t=START.next;
            
            int i=0;
            
            while(t!=null)
            {
                if(i==index)   //update logic
                {
                    t.data = num;
                    System.out.println("value at "+index+" updated to "+num);
                    
                    break;
                }
                else
                {
                    i++;
                    t=t.next;
                }
            }
        }
    }
    
    
    void deleteAt(int index)
    {
        if( index<0 || index >= size() )
        {
            try
            {
               throw new Exception("Index is out of range");
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else
        {
            if(index==0)
            {
                START.next = START.next.next;
            }
            else
            {
                int i=0;
                Node t = START.next;
                
                while(true)
                {
                    if( i == (index-1))
                    {
                        System.out.println(t.next.data+ " is deleted at index "+index);
                        t.next = t.next.next;
                       
                        break;
                    }
                    else
                    {
                        i++;
                        t=t.next;
                    }
                }
                
                
            }
                
            
        }
    }
    
    
    void delete(int num)   // this is delete node with value num
    {
        
    }
    
    int getMiddleElementOfList()
    {
        int mid = size()/2;
        
        if(mid!=0)
        {
           return getDataAt(mid);
        }
        else
        {
            return -1;
        }
    }
    
    @Override
    public String toString()
    {
       String ans="[";
       
       if(START.next==null)
       {
           ans = ans + " -- LIST IS EMPTY -- ";   
       }
       else
       {
           // Traverse all element of list , till u reach null
           Node t = START.next;
           
           while( t!=null )
           {
               ans= ans + t.data + " --> ";
               t=t.next;
           }
       }
    
       ans=ans+" ]";
    
       return ans;
    }
   
    void printUsingRec(Node n)
    {
        if(n==null)
        {
            System.out.print("--> X");
        }
        else
        {
          System.out.print(n.data+"  -- ");
         
          printUsingRec(n.next);
          
          
        }
    }
    
    void reversePrintUsingRec(Node n)
    {
        if(n==null)
        {
            System.out.print(" X -> ");
        }
        else
        {
          
          reversePrintUsingRec(n.next);
          
          System.out.print(n.data+"  -- ");
          
        }
    }
    
   
    MyLinkedList reverseList()
    {  
        if(START.next==null)
        {
            return null;
        }
        else
        {
           MyLinkedList ans = new MyLinkedList();
       
           Node temp = START.next;
           
           while(temp!=null)
           {
               ans.addAsFirst(temp.data);
               temp = temp.next;
           }
           
           return ans;
        }
        
    }
    
}
