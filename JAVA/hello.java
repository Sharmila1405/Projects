public class hello {
    public static void main(String[] args)
    {
        System.out.println("Hello World!!");
        sum();
    }

    public static void sum()
    {
        int total_sum = 0, count = 0;
        for(int i=1; i<=1000; i++)
        {
            if(count==5)
            {
                break;
            }
            if(i%3==0 && i%5 == 0)
            {
                System.out.println(i);
                total_sum += i;
                count++;
            }

        }
        System.out.println("The sum is:"+total_sum);
    }
}