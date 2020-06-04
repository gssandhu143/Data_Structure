package ArraysAndMatrix;

// Rotate matrix by 90 clockwise

import java.util.Scanner;


public class RotateMatrixBy90 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n,i,j;
        
        System.out.println("Enter Size of n");
        n=sc.nextInt();
        
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        
        
        System.out.println("Enter elements of "+n+" X "+n+" Matrix");
        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=n-1;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
     
        
        System.out.println("Elements in Original  Matrix ");
        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=n-1;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            
            System.out.println();
        }
        
        // Logic for Rotation
        int k=n-1;
        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=n-1;j++)
            {
                b[j][k] = a[i][j] ;
            
                System.out.println(j+","+k+" <-- "+i+","+j);
            }
            
            k--;
        }
        
        System.out.println("Elements in Matrix After Rotation");
        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=n-1;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            
            System.out.println();
        }
        
        System.out.println("Corner elements "+a[0][0]+" "+a[0][n-1]+" "+a[n-1][0]+" "+a[n-1][n-1]);
    }
    
}
