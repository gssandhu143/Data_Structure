package ArraysAndMatrix;

import java.util.Arrays;

public class Reverse_Array 
{
    public static void main(String[] args) 
    {
        int b[] = { 10,20,30,40,50,60,70,80,90,100 };
        
        System.out.println(Arrays.toString(b));
        
        reverse(b);
        
        System.out.println(Arrays.toString(b));
        
    }
    
    static void reverse(int a[])
    {
        int l=a.length, i, temp;
        
        for(i=0;i<l/2;i++)
        {
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
       
    }
}
