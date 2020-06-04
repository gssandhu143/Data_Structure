package DS.Stack_Examples;

public class Testing_MyStack 
{
    public static void main(String[] args) 
    {
       MyStack st=new MyStack(5);
       
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       
       st.push(60);
       st.push(70);
       
       System.out.println(st);
       
       /*
       st.pop();
       st.pop();
       st.pop();
       st.pop();
       st.pop();
       
       st.pop();
       st.pop();
       */
       
       while( ! st.isEmpty() )
       {
           st.pop();
       }
       
       System.out.println(st);
    }
}
