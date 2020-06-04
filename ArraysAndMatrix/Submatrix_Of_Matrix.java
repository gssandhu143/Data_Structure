package ArraysAndMatrix;

import java.util.Scanner;

public class Submatrix_Of_Matrix
{
    public static void main(String[] args) {
        
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
        
        System.out.println("--- ORIGINAL MATRIX ---");
        printMatrix(a);
        
        System.out.println("--- SUB MATRIX ---");
        printSubMatrix(a);
        
        int sub[][] = extractSubMatrix(a);
        System.out.println("-- Extracted SubMatrix --");
        printMatrix(sub);
    }
    
    static void printSubMatrix(int a[][])
    {
       int i,j;
        
        for(i=1;i<=a.length-2;i++)
        {
            for(j=1;j<=a[i].length-2;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            
            System.out.println();
        }   
    }
    
    static int[][] extractSubMatrix(int a[][])
    {
       int i,j;
       int b[][]=new int[ a.length-2 ] [ a[0].length-2 ];
        
        for(i=1;i<=a.length-2;i++)
        {
            for(j=1;j<=a[i].length-2;j++)
            {
                b[i-1][j-1]=a[i][j];
            }
        }   
        
        return b;
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
