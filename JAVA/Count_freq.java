import java.util.Scanner;
public class Count_freq {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the N value: ");
        int N = inp.nextInt();
        System.out.println("Enter the D digit: ");
        int D = inp.nextInt();

        if(N<0)
        {
            N = -N;
        }
        if(N == 0 && D == 0)
        {
            System.out.println(1);
        }
        else
        {
            int count = 0;
            while(N>0)
            {
                int rem = N % 10;
                N = N / 10;
                if(rem == D)
                {
                    count ++;
                }
            }
            System.out.println(count);
        }

        
    }
    
}
