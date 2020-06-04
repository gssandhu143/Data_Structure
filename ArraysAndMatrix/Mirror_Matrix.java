package ArraysAndMatrix;

public class Mirror_Matrix 
{
    public static void main(String[] args) 
    {
       int a[][] = { {1,2,3} , {4,5,6}, {7,8,9} };    
    
       System.out.println("--- ORIGINAL --");
       printMatrix(a);
       
        System.out.println("--  MIRROR --");
       int b[][] = mirrorMatrix(a);
        printMatrix(b);
       
    }
    
    static int[][] mirrorMatrix(int a[][])
    {
        int i,j;
        int SIZE = a.length;
        
        int b[][]=new int[a.length][a[0].length];
        
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<=a.length-1;j++)
            {
                System.out.println(i+","+j +" --> "+i+","+(SIZE-1-j));
                b[i][j] = a[i][SIZE-1-j];
            }
            
            System.out.println();
        }
        
        return b;
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
