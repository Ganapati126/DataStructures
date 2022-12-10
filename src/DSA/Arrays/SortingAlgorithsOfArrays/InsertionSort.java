package DSA.Arrays.SortingAlgorithsOfArrays;

import java.util.Scanner;

public class InsertionSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arSize = sc.nextInt();
        int[] intArray = new int[arSize];
        for (int i =0; i < intArray.length; i++)
        {
            intArray[i] = sc.nextInt();
        }
    }

    public static void iSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int holder1 = arr[i];
            int holder2;
            for(int j = i; j>0 && arr[j] < arr[j-1];j--)
            {
                holder2 = j;
            }
            //complete it

        }
    }
}
