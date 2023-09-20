package DS.Sorting;

public class insertion {

    public static int[] sort(int[] arr)
    {
        for(int i =1; i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && (arr[j]>key))
            {

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6};
        arr = sort(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}
