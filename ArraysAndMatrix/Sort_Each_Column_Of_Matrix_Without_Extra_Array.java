package ArraysAndMatrix;

import java.util.Arrays;

public class Sort_Each_Column_Of_Matrix_Without_Extra_Array 
{
    public static void main(String[] args) 
    {
       int i,j;

       int a[][] = {  { 9,8,7 }, { 6,5,4 }, {3,2,1} };
    
       System.out.println("-- ORIGINAL MATRIX --");
       printMatrix(a);
       
       int k, temp;
    
       for(i=0;i<a.length;i++)
       {
           
           
          // Bubble Sort on Each Column 
          for(k=0;k<a.length-2;k++)   // passes
          {
            
            for(j=0;j<a[i].length-1;j++)   // comparison loop
            {
                if(a[j][i]>a[j+1][i])
                {
                    temp = a[j][i];
                    a[j][i] = a[j+1][i];
                    a[j+1][i] = temp; 
                }
            }
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
