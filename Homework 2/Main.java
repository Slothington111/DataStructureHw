// Name: Aqdas Khan
// Programming Language: Java
// IDE/ Editor: Visual Studio Code

public class Main
{
    public static void main(String[] args)
    {
        int[] original = {42, 17, 8, 63, 25, 91, 4, 56, 30, 72, 11, 49}; 

        System.out.println("Original Array:");

        for (int number : original)
        {
            System.out.print(number + " ");
        }
        System.out.println();


        int [] bubbleArray = original.clone();
        bubbleSort(bubbleArray);
        System.out.println("\nBubble Sort Result:");

        for (int number : bubbleArray)
        {
            System.out.print(number + " ");
        }
        System.out.println();


        int[] mergeArray = original.clone();
        
        mergeSort(mergeArray, 0, mergeArray.length - 1);
        System.out.println("\nMerge Sort Result");
        for (int number : mergeArray)
        {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void mergeSort(int[] arr, int left, int right)
    {
        
    }
}

