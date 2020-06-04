package ArraysAndMatrix;

import java.util.Scanner;

public class Boundary_Elements_Of_Matrix 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n, i,j;
        System.out.println("Enter value of n between 3 to 9");
        n=sc.nextInt();
    
        int a[][]=new int[n][n];
    
        System.out.println("Enter elements of "+n+"x"+n+" matrix");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
              a[i][j] = sc.nextInt();  
            }
        }
        
        System.out.println("-- Boundary elements --");
        boundaryElements(a);
    }
    
    static void boundaryElements(int a[][])
    {
        int i,j;
        
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
               if(i==0 || i==a.length-1 || j==0 || j==a.length-1)
               {
                 System.out.print(a[i][j]+"\t");  
               }
               else
               {
                   System.out.print("\t");
               }
            }
            
            System.out.println();
        }
    }
    
}
