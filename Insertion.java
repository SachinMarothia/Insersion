public class Insertion
 {
    public static void PrintArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {7, 8, 3, 1, 15, 12, 17, 2};
        // Insertion Sorting
        for(int i=1; i<arr.length; i++)
        {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        PrintArray(arr);

        System.out.println("Minimum element is "+arr[0]);
        System.out.println("Maximum element is "+arr[arr.length-1]);
    }    
}
