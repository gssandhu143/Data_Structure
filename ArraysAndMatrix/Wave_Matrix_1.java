package ArraysAndMatrix;

public class Wave_Matrix_1 
{
    public static void main(String[] args) 
    {
        
       int a[][] = { { 1,2,3 }, {4,5,6} ,{7,8,9} };
        
        horizontalWaveTraverse(a);
        
        System.out.println("---------");
        
        verticalWaveTraverse(a);
        
    }
    
    static void horizontalWaveTraverse(int a[][])
    {
        int i,j;
        
        for(i=0;i<a.length;i++)
        {
           if(i%2==0)
           {
              for(j=0; j<=a[i].length-1; j++)
              {
                  System.out.print(a[i][j]+" ");
              }
           }
           else
           {
              for(j=a[i].length-1; j>=0; j--)
              {
                  System.out.print(a[i][j]+" ");
              }
           }
           
            System.out.println("");
        }
    }

    static void verticalWaveTraverse(int a[][])
    {
        int i,j;
        
        for(i=0;i<a.length;i++)
        {
           if(i%2==0)
           {
              for(j=0; j<=a[i].length-1; j++)
              {
                  System.out.print(a[j][i]+" ");
              }
           }
           else
           {
              for(j=a[i].length-1; j>=0; j--)
              {
                  System.out.print(a[j][i]+" ");
              }
           }
           
           // System.out.println("");
        }
    }
}
