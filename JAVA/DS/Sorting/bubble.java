package DS.Sorting;

public class bubble {
    public static int[] sort(int[] arr)
    {

        for(int i=0; i<arr.length-1;i++)
        {
            for(int j = 0;j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 0,3,6,5,7 };
        
        arr = sort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

