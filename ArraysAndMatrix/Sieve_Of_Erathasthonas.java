package ArraysAndMatrix;

import java.util.*;

public class Sieve_Of_Erathasthonas 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Limit");    
        
        int num = sc.nextInt();
        int i,j;
        
        int a[]=new int[num+1];
        
        for(i=0;i<=num;i++)
        {
            a[i] = i;
        }
        
        for(i=2;i<=Math.sqrt(num);i++)
        {
            System.out.println("TRYING "+i+"...");
            
            for(j=2; i*j<=num ;j++)  // Multiples of i
            {
                if(a[i*j]!=0)
                {
                    a[i*j]=0;
                    System.out.println("Crossing "+(i*j)+" X");
                }
            }
        }
        
        // Only Primes
        for(i=0;i<=num;i++)
        {
            if(a[i]!=0)
             System.out.print(a[i]+" ");
        }
    }
    
}
