import java.util.Scanner;
public class power_digit {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number: ");

        double n = inp.nextDouble();
        System.out.println("Enter power: ");
        int p = inp.nextInt();

        
        if(p<0)
        {
            double x = power(n,-p);
            System.out.println(1/x);
        }
        else
        {
            double x = power(n,p);
            System.out.println(x);
        }

    }
    public static double power(double n, int p)
    {
        if(p == 0)
        {
            return 1.0;
        }
        else{
            return n * power(n, p-1);
        }
    }
    
}
