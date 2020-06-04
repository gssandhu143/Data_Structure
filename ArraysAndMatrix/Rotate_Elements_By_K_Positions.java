
package ArraysAndMatrix;

import java.util.*;

public class Rotate_Elements_By_K_Positions 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
         
        int a[] = { 10,20,30,40,50,60,70,80,90,100 };
     
        System.out.println("How many positions u want to Rotate");
        int K =sc.nextInt() ;
        
        int temp[] = new int[K];
        
        int i;
        
        // Copy first K elements in temp array
        for(i=0;i<K;i++)
        {
            temp[i]=a[i];
        }
        
        //Shift Elements By K Postions
        for(i=K;i<a.length;i++)
        {
            a[i-K]=a[i];
        }
        
        for(i=0 ;i<= K-1;i++)
        {
            a[ a.length-K + i]=temp[i];
        }
        
        System.out.println("-- After Rotation ---");
        
        System.out.println(Arrays.toString(a));
    }
    
    
    
}
