package DS.searching;
// used for sorted array
public class binary {

    public static int search(int[] arr, int number)
    {
        int start = 0;
        int end = arr.length -1;
        while(start<=end)
        {
            int mid = start+ (end-start)/2;

            if(arr[mid] == number)
            {
                return mid;
            }
            if(arr[mid]>number)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        return -1;
        
    }
    public static int search_rec(int arr[],int x,int l, int r)
    {
        if(l<=r)
        {
            int mid = l + (r-l)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            if(arr[mid]>x)
            {
                r = mid -1;
                return search_rec(arr, x, l, r);
            }
            else{
                l = mid +1;
                return search_rec(arr, x, l, r);
            }
        }

        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        // int result = search(arr, x);
        int result = search_rec(arr, x, 0, arr.length-1);
        if(result == -1)
        {
            System.out.println("NOT FOUND");
        }
        else {
            System.out.println("Found at :"+result);
        }
    }
    
}
