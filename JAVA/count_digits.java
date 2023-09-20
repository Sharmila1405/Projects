import java.util.Scanner;
public class count_digits {

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = inp.nextInt();

        String number = Integer.toString(n);
        if(n>0)
        {
            System.out.println("No.of digits in a number : "+number.length());
        }
        else
        {
            System.out.println("No. of digits in a number : " +(number.length()-1));
        }

        int count = 0;
        while(n>0)
        {
            n = n/10;
            count++;
        }
        System.out.println("count: "+count);


    }
    
}
