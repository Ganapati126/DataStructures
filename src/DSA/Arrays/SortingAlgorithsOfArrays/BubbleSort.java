package DSA.Arrays.SortingAlgorithsOfArrays;


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
        int stepCounter = 0;
        int stepCounter2 = 0;
        for (int i = 0; i < intArray.length-1; i++)
        {
            for(int j = intArray.length-1; j > i; j--)
            {
                stepCounter++;
                if(intArray[i]>intArray[j])
                {
                    int holder = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = holder;
                    stepCounter2++;
                }
            }
        }
        String s = "";
        for (int i = 0; i < intArray.length; i++)
        {
            s = s + " "+ String.valueOf(intArray[i]);
        }
        System.out.println(s);
        System.out.println(stepCounter);
        System.out.println(stepCounter2);
    }
}
