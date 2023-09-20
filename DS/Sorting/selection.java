package DS.Sorting;

public class selection {

    public static void sort(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            int min_index = i;
            for(int j = i+1 ; j<arr.length;j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {64,1,25,12,22,11,9};
        sort(arr);
    }
    
}
