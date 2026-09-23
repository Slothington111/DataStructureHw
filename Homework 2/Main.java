// Name: Aqdas Khan
// Programming Language: Java
// IDE/ Editor: Visual Studio Code

public class Main
{
    public static void main(String[] args)
    {
        // Part 2 - Original Array
        int[] original = {42, 17, 8, 63, 25, 91, 4, 56, 30, 72, 11, 49}; 

        System.out.println("Original Array:");

        for (int number : original)
        {
            System.out.print(number + " ");
        }
        System.out.println();


        // Part 3 - Bubble Sort
        int [] bubbleArray = original.clone();
        bubbleSort(bubbleArray);
        System.out.println("\nBubble Sort Result:");

        for (int number : bubbleArray)
        {
            System.out.print(number + " ");
        }
        System.out.println();

        // Part 5 - Merge Sort
        int[] mergeArray = original.clone();
        mergeSort(mergeArray, 0, mergeArray.length - 1);
        System.out.println("\nMerge Sort Result");
        for (int number : mergeArray)
        {
            System.out.print(number + " ");
        }
        System.out.println();

        // Part 7 and 8 - Linear Search
        System.out.println("\nLinear Search");
        int target1 = 17;
        int result1 = linearSearch(original, target1);
        System.out.println("Search 1:");
        System.out.println("Target: " + target1);
        
        if (result1 != -1)
        {
            System.out.println("Target found at index " + result1);
        }
        else
        {
            System.out.println("Target not found.");
        }

        int target2 = 49;
        int result2 = linearSearch(original, target2);
        System.out.println("\nSearch 2:");
        System.out.println("Target: " + target2);
        
        if (result2 != -1)
        {
            System.out.println("Target found at index " + result2);
        }
        else
        {
            System.out.println("Target not found.");
        }

        int target3 = 500;
        int result3 = linearSearch(original, target3);
        System.out.println("\nSearch 3:");
        System.out.println("Target: " + target3);
        
        if (result3 != -1)
        {
            System.out.println("Target found at index " + result3);
        }
        else
        {
            System.out.println("Target not found.");
        }

        // Part 9 and 10 - Binary Search
        System.out.println("\nBinary Search");
        int binaryTarget1 = 8;
        int binaryResult1 = binarySearch(mergeArray, binaryTarget1);
        System.out.println("\nSearch 1:");
        System.out.println("Target: " + binaryTarget1);
        if (binaryResult1 != -1)
        {
            System.out.println("Target found at index " + binaryResult1);
        }
        else
        {
            System.out.println("Target not found.");
        }

        int binaryTarget2 = 91;
        int binaryResult2 = binarySearch(mergeArray, binaryTarget2);
        System.out.println("\nSearch 2:");
        System.out.println("Target: " + binaryTarget2);
        if (binaryResult2 != -1)
        {
            System.out.println("Target found at index " + binaryResult2);
        }
        else
        {
            System.out.println("Target not found.");
        }

        int binaryTarget3 = 500;
        int binaryResult3 = binarySearch(mergeArray, binaryTarget3);
        System.out.println("\nSearch 3:");
        System.out.println("Target: " + binaryTarget3);
        if (binaryResult3 != -1)
        {
            System.out.println("Target found at index " + binaryResult3);
        }
        else
        {
            System.out.println("Target not found.");
        }
    }

    // Part 3 - Bubble Sort
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

    // Part 5 - Merge Sort
    public static void mergeSort(int[] arr, int left, int right)
    {
        if (left < right)
        {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }
    public static void merge(int [] arr, int left, int middle, int right)
    {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int [] leftArray = new int[n1];
        int [] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
        {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++)
        {
            rightArray[j] = arr[middle + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2)
        {
            if (leftArray[i] <= rightArray[j])
            {
                arr[k] = leftArray[i];
                i++;
            }
            else
            {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Part 7 - Linear Search
    public static int linearSearch(int [] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    // Part 9 - Binary Search
    public static int binarySearch(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right)
        {
            int middle = (left + right) / 2;
            
            if (arr[middle] == target)
            {
                return middle;
            }
            if (target < arr[middle])
            {
                right = middle - 1;
            }
            else
            {
                left = middle + 1;
            }
        }
        return -1;
    }
}

