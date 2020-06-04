package ArraysAndMatrix;

import java.util.Arrays;

public class Sort_Each_Row_Of_Matrix 
{
    public static void main(String[] args) 
    {
        //int a[][]=  {  {3,2,1}, {6,5,4}, {9,8,7} };
        int a[][]=  {  {3,4,5}, {7,8,9}, {6,5,4} };
        
        /*
        for(int i=0;i<a.length;i++)
        {
            Arrays.sort(a[i]);
        }
        */
        
        //Arrays.sort( a[0] );
        //Arrays.sort( a[1] );
        //Arrays.sort( a[2] );
        
        /*
        int b[] = a[0];
        Arrays.sort(b);
        */      

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
