package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {
    public static int[] remove(int[] array, int index)
    {
        if(index < 0 || index>array.length-1)
        {
            System.err.println("Invalid Index" + index);
            System.exit(0);
        }
        int [] result = {};
        for (int i = 0; i < array.length; i++) {
            if(i!=index)
            {
               result =ArraysUtility.addElements(result,array[i]);
            }
        }
        return result;
    }
}
