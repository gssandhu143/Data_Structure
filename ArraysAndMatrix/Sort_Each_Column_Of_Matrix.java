package ArraysAndMatrix;

import java.util.Arrays;

public class Sort_Each_Column_Of_Matrix 
{
    public static void main(String[] args) 
    {
       int i,j;

       int a[][] = {  { 9,8,7 }, { 6,5,4 }, {3,2,1} };
    
       System.out.println("-- ORIGINAL MATRIX --");
       printMatrix(a);
       
       int b[]=new int[a.length];
    
       for(i=0;i<a.length;i++)
       {
           // Copy elements of one column to b[]
           for(j=0;j<a[i].length;j++)
           {
               b[j] = a[j][i];
           }
           
           // Sort b[]
           Arrays.sort(b);
           
           // Copy back from b[] tol column
           for(j=0;j<a[i].length;j++)
           {
               a[j][i]=b[j];
           }
       }
       
        System.out.println("-- OUTPUT --");
        printMatrix(a);
    
    }
   
    

    static void printMatrix(int a[][])
    {
        int i,j;
        
        for(i=0; i<a.length; i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            
            System.out.println();
        }
    }    
}
