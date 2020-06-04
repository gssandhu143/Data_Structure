package DS.Stack_Examples;

public class Testing_MyStack_Gen 
{
    public static void main(String[] args) 
    {
        MyStack_Gen<String> st=new MyStack_Gen<>(5);
        
        st.push("ABC");
        st.push("XYZ");
        st.push("PQR");
        
        while(! st.isEmpty())
        {
            st.pop();
        }
        
        MyStack_Gen<Integer> st2=new MyStack_Gen<>(5);
        
        st2.push(10);
        st2.push(20);
        st2.push(30);
        st2.push(40);
        st2.push(50);
        
        while(! st2.isEmpty())
        {
            st2.pop();
        }
        
    }
}
