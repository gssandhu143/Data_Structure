package DS.Stack_Examples;

public class Testing_MyStack_LL 
{
    public static void main(String[] args) 
    {
        MyStack_Using_LL stack1=new MyStack_Using_LL();
        
        System.out.println(stack1);
    
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);
        stack1.push(60);
        stack1.push(70);
        stack1.push(80);
        stack1.push(90);
        stack1.push(100);
        
        
        System.out.println("\n");
        System.out.println(stack1);
        
        stack1.pop();
        stack1.pop();
        
        System.out.println();
        System.out.println(stack1);
        
        while(! stack1.isEmpty())
        {
            stack1.pop();
        }
        
        System.out.println("");
        System.out.println(stack1);
            
        
    }
}
