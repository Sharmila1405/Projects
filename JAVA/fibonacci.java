import java.util.*;
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = inp.nextInt();
        int i1 = 0, i2 = 1;
        if(n<0)
        {
            System.out.println("Negative num not allowed");
        }
        else if(n==0)
        {
            System.out.println(i1);
        }
        else if(n==1)
        {
            System.out.println(i2);
        }
        else 
        {
            int c = 0;
            for(int i = 2; i<=n; i++)
            {
                c = i1 + i2;
                i1 = i2;
                i2 = c;
                System.out.println(c);

            }
            System.out.println("Normal: "+c);
        }

        int x = fab(n);
        System.out.println("Recursion :"+x);


       
    }
     // Recursive
    public static int fab(int n)
    {
        if(n == 1 || n == 2)
        {
            return 1;
        }
        else if(n == 0)
        {
            return 0;
        }
        else{
            return fab(n-1) + fab(n-2);
        }
    }

}
