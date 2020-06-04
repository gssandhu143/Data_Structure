package ArraysAndMatrix;

public class Transpose_Of_Matrix
{
    public static void main(String[] args) 
    {
        int a[][] =  {  {1,2,3 }, {4,5,6}, {7,8,9}  };
        
        int b[][] =  new int[3][3];
        
        // Transpose Logic
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                b[i][j] = a[j][i];
            }
        }
        
        System.out.println("--- Matrix a ---");
        printMatrix(a);
        
        System.out.println("----------------");
        
        System.out.println("--- Matrix b ---");
        printMatrix(b);
        
        
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
