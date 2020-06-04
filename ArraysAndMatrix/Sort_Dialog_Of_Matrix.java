/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndMatrix;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Sort_Dialog_Of_Matrix 
{
    public static void main(String[] args) 
    {
       int a[][]= {  {9,9,9,9}, {  8,8,8,8}, {7,7,7,7,}, {6,6,6,6} };     
        
        System.out.println("-- ORIGINAL MATRIX --");
        printMatrix(a);
        
        sortDiagnol(a);
        
        System.out.println("-- After Sorting --");
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
     
     static void sortDiagnol(int a[][])
     {
         // Logic
         int b[]=new int[a.length];
         
         int i,j,k=0;
         
         // Copy Diagnol Elements to 1D Array
         for(i=0;i<a.length;i++)
         {
             for(j=0;j<a[i].length;j++)
             {
                 if(i==j)   // left diagnol
                 {
                    b[k]=a[i][j];
                    k++;
                 }
             }
         }
         
         Arrays.sort(b);
         
         k=0;
         // COpy back to Diagnol 
         for(i=0;i<a.length;i++)
         {
             for(j=0;j<a[i].length;j++)
             {
                 if(i==j)   // left diagnol
                 {
                    a[i][j]=b[k];
                    k++;
                 }
             }
         }
         
     }
}
