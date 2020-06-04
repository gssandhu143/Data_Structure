package ArraysAndMatrix;

import java.util.Arrays;

public class Sort_Elements_Of_Matrix 
{
    public static void main(String[] args)
    {
        int a[][]= { {6,5,4},{ 9,8,7}, {3,2,1} };
        
        printMatrix(a);
        
        int SIZE = a.length;
        
        int b[] = new int[SIZE*SIZE];
        
        int i,j,k=0;
        
        // Fill 1D Array from 2D Array
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                b[k]=a[i][j];
                k++;
            }
        }
        
        System.out.println(Arrays.toString(b));
        
        Arrays.sort(b);
        
        k=0;
        // Fill 2D Array Back from 1D Array
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                a[i][j]=b[k];
                k++;
            }
        }
        
        System.out.println("-- After Sorting ---");
        printMatrix(a);
        
    }
   
    static void printMatrix(int a[][])
    {
        int i,j;
        
        for(i=0;i<=a.length-1;i++)
        {
            for(j=0;j<=a[i].length-1;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            
            System.out.println();
        }
    }
    
}
