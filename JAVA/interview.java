public class interview {

    public static void main(String[] args)
    {
        int[] arr = new int[31];

        for(int i=0;i<=30;i++)
        {
            arr[i] = i+1;
        }
        arr[30] = 22;

        duplicated(arr);

    }

    public static void duplicate(int[] arr)
    {
        int sum = (arr.length-1) * (arr.length)/2;


        int total = 0;

        for(int num : arr)
        {
            total += num;
        }

        System.out.println("The duplicate eleemnt is: "+(total-sum));

    }


    public static void duplicated(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("The duplicate eleemnt is: "+(arr[j]));
                }
            }
        }
    }
    
}
