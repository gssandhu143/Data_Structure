package ArraysAndMatrix;

public class Print_All_Primes 
{
    public static void main(String[] args) 
    {
       for(int i=2;i<=50;i++)
       {
           if(isprime(i))
           {
            System.out.println(i);
           }
       }
    }
    
    static boolean isprime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        
        return true;
    }
}
