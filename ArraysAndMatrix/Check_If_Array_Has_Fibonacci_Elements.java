package ArraysAndMatrix;

public class Check_If_Array_Has_Fibonacci_Elements 
{
    public static void main(String[] args) 
    {
        int a[] = { 0,1,1,2,3,5,8,13,21,34 };
       
        System.out.println(checkArrayHasFibonacciElements(a));
        
    }
    
    static boolean checkArrayHasFibonacciElements(int a[])
    {
        int i;
        
        boolean flag=true;
        
        for(i=2;i<=a.length-1;i++)
        {
            if( a[i] != (a[i-1]+a[i-2]) )
            {
                System.out.println(a[i]+" not fibonacci element");
                flag=false;
                break;
            }
        }
        
        return flag;
    }
    
}
