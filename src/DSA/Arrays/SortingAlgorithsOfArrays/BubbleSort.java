package DSA.Arrays.SortingAlgorithsOfArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arSize = sc.nextInt();
        int[] intArray = new int[arSize];
        for (int i =0; i < intArray.length; i++)
        {
            intArray[i] = sc.nextInt();
        }
        for (int i = 0; i < intArray.length; i++)
        {
            for(int j = i+1; j < intArray.length-1; j++)
            {
                if(intArray[i]>=intArray[j])
                {
                    int holder = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = holder;
                }
            }
        }
        String s = "";
        for (int i = 0; i < intArray.length; i++)
        {
            s = s + " "+ String.valueOf(intArray[i]);
        }
        System.out.println(s);
    }
}
