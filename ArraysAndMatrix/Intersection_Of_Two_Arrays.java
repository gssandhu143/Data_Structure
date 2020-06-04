package ArraysAndMatrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_Of_Two_Arrays 
{
    public static void main(String[] args) 
    {
        int a[]={10,20,30,40,50,60,70};
        int b[]={50,10,30,90,100};
        
        int c[] = intersectionOfArrays(a, b);
        
        System.out.println(Arrays.toString(c));
        
    }
    
    
    static int[] intersectionOfArrays(int a[], int b[])
    {
        int i,j;
        
        ArrayList<Integer> al=new ArrayList<>();
        
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    al.add(a[i]);
                }
            }
        }
        
        System.out.println("Common Elements "+al);
        
        
        int c[]=new int[al.size()];
        
        for(i=0;i<c.length;i++)
        {
            c[i] = al.get(i);
        }
        
        return c;
        
    }
}
