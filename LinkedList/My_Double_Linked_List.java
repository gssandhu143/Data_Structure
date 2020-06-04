package DS.LinkedList;


class My_Double_Linked_List
{
    DNode START;
    DNode END;

    public My_Double_Linked_List() 
    {
       START = null;
       END = null;
    }
    
    void addtoList(int num)
    {
        if ( START==null && END==null )    // First Node
        {
            DNode nd=new DNode(num);
            
            START=nd;
            END=nd;
            
            System.out.println(num+" added as First node in DList");
        }
        else
        {
            DNode nd=new DNode(num);
            
            DNode t = START;
            
            while(t.next!=null)
            {
                t=t.next;
            }
            
            t.next=nd;
            nd.prev=t;
            END=nd;
            
            System.out.println(num+" node added to DList");
        }
    }
    
    void update(int orig_data, int new_data)
    {
        if(START==null && END==null)
        {
            System.out.println("-- List is Blank , Cannot Update --");
        }
        else
        {
            DNode t = START;
            
            while(t!=null)
            {
                if(t.data==orig_data)
                {
                    t.data = new_data;
                    System.out.println(orig_data+" replaced with "+new_data);
                    break;
                }
                
                t=t.next;
            }
            
            
        }
    }
    
    void delete(int num)
    {
        if(START==null && END==null)
        {
            System.out.println("-- List is Empty --, Cannot Delete");
        }
        else
        {
            DNode t=START;
            
            
            boolean found=false;
            
            while(t!=null)
            {
                if(t.data==num)
                {
                    found=true;
                    break;
                }
                
                t=t.next;
            }
            
            if(found)
            {
                
                if(t.prev==null)
                {
                   START = t.next;
                }
                else
                {
                   t.prev.next = t.next;  
                }
                
                if(t.next==null)
                {
                   END=t.prev;
                }
                else
                {
                   t.next.prev = t.prev;
                }
                
                
                t.next=null;
                t.prev=null;
                t=null;
                
                System.out.println(num+" deleted from list");
            }
            else
            {
                System.out.println("-- Number not found, Cannot Delete --");
            }
            
            
        }
    }
    
    void printFWD()
    {
           if(START==null && END==null)
           {
               System.out.println("-- DLIST EMPTY --");
           }
           else
           {
             DNode t = START;
           
             while(t!=null)
             {
               System.out.print(t.data+" --> ");
               t=t.next;
             }
           
             System.out.println("\n");
           }
    }
    
    void printBACKWARD()
    {
        if(START==null && END==null)
           {
               System.out.println("-- DLIST EMPTY --");
           }
           else
           {
        
             DNode t = END;
           
             while(t!=null)
             {
               System.out.print(t.data+" --> ");
               t=t.prev;
             }
           
             System.out.println("");
           }
    }

    @Override
    public String toString() 
    {
         String ans = "START  == ";
         
         DNode t=START;
         
         while(t!=null)
         {
             ans = ans+ (t.data+" == ");
             t=t.next;
         }
         
         ans = ans +"  END";
         return ans;
    }
    
    
}