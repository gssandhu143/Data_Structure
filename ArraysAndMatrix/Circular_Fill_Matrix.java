package ArraysAndMatrix;

import java.util.Scanner;

public class Circular_Fill_Matrix 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number between 3 to 9");
        int n = sc.nextInt();
        
        int a[][]=new int[n][n];
        
        int i,j;
        
        circularFill(a);
        
        printMatrix(a);
    }
    
    static void circularFill(int a[][])
    {
           int i,j, k=1, SIZE=a.length;
           
           int x1=0, x2=a.length-1, y1=0, y2=a[0].length-1;
           
           i=0;
           while(true)
           {
               
               //System.out.println("x1 = "+x1+" x2="+x2+" y1="+y1 +" y2= "+y2 );
               
               // Fill RIGHT 
               for(j=x1; j<=x2; j++)
               {
                   a[i][j]=k;
                   k++;
               }
               
               j--;       // since j moves 1 extra
               y1=y1+1;   // shift y1 boundary
               
              
               // Fill DOWN //
               for(i=y1; i<=y2; i++)
               {
                   a[i][j]=k;
                   k++;
               }
               
               i--;        // move back i
               x2=x2-1;    // shift x2 boundary
               
               
               // Fill LEFT // 
               for(j=x2;j>=x1;j--)
               {
                   a[i][j]=k;
                   k++;
               }
               
               j++;       // move back j
               y2=y2-1;   // shift y2 boundary
               
               
               // Fill UP //
               for(i=y2;i>=y1;i--)
               {
                   a[i][j]=k;
                   k++;
               }
               
               i++;       // move back i
               x1=x1+1;   // shift x1 boundary
               
               
               if(k>SIZE*SIZE)
               {
                   System.out.println("breaking loop");
                   break;
               }
           }
    }
    
     static void printMatrix(int a[][])
    {
        int i,j;
        
        for(i=0;i<a.length;i++)
        {
           for(j=0;j<a[i].length;j++)
           {
               System.out.print(a[i][j]+"\t");
           }
           
            System.out.println();
        }
    }
    
    
}
