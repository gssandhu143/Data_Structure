package ArraysAndMatrix;


public class PrintMarix_Using_Single_Loop
{
    public static void main(String[] args) 
    {
       int a[][]= { { 1,2,3 }, {4,5,6}, {7,8,9} };    
        
        printMatrixUsingSingleLoop(a);
    }
    
    static void printMatrixUsingSingleLoop(int a[][])
    {
        int i,j=0;
        
        for(i=0; i<a.length ; )
        {
            System.out.print(a[i][j]+"\t");
            j++;
            
            if(j==a[i].length)
            {
                //System.out.println(" -- ROW ENDS --");
                System.out.println();
                
                i++;   // start next row
                j=0;   // reset column 
                
                //break;
            }
            
            
                try 
                {    
                    Thread.sleep(1000);
                } 
                catch (InterruptedException ex) 
                {
                  ex.printStackTrace();
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
                System.out.print(i+","+j+"\t");
                
                try 
                {    
                    Thread.sleep(1000);
                } 
                catch (InterruptedException ex) 
                {
                  ex.printStackTrace();
                }
                
            }
            
            System.out.println();
        }
    }
}
