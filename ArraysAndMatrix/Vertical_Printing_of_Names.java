package ArraysAndMatrix;

public class Vertical_Printing_of_Names 
{
    public static void main(String[] args)
    {
         String names[] = { "VASU" ,"AMRINDER", "ROHIT", "HARMAN" }; 
         
         int i,j, longest_length=0;
         
         for(i=0;i<names.length;i++)
         {
             if(names[i].length()>longest_length)
             {
                 longest_length=names[i].length();
             }
         }
         
         System.out.println("Length of Longest Name "+longest_length);

        for(j=0;j<longest_length;j++)   // Rows
        {
           for(i=0;i<names.length;i++)  // Columns
           {
              if(j<names[i].length())
              {
                System.out.print(names[i].charAt(j)+"\t");
              }
              else
              {
                  System.out.print("\t");
              }
                      
           }
           
            System.out.println();
        }
        
    }
    
}
