package DS.searching;

public class linear {
    public static int search(int[] arr, int number)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==number)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,10,89,4,70,344,30};
        int x = 10;
        int result = search(arr, x);
        if(result != -1)
        {
            System.out.println("Element present at index "+result);
        }
        else
        {
            System.out.println("Element not Found");
        }
    }
    
}
