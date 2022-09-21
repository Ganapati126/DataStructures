package DSA.Arrays.SortingAlgorithsOfArrays;

import java.util.Scanner;

public class SelectionSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arSize = sc.nextInt();
        int[] intArray = new int[arSize];
        for (int i =0; i < intArray.length; i++)
        {
            intArray[i] = sc.nextInt();
        }
        ssort(intArray);
    }

    public static void ssort(int[] arr)
    {
        int stepCounter1 = 0;
        int stepCounter2 = 0;
        String s = "";
        for(int mainPos = 0; mainPos < arr.length-1 ; mainPos++)
        {
            int lowest = mainPos;
            for(int j = arr.length-1; j > mainPos; j--)
            {
                stepCounter1++;
                if(arr[j]<arr[lowest])
                {
                    stepCounter2++;
                    lowest = j;
                }
            }
            int holder = arr[lowest];
            arr[lowest] = arr[mainPos];
            arr[mainPos] = holder;
        }
        s = "";
        for (int i = 0; i < arr.length; i++)
        {
            s = s + " "+ String.valueOf(arr[i]);
        }
        System.out.println(s);
        System.out.println(stepCounter1);
        System.out.println(stepCounter2);
    }
}
