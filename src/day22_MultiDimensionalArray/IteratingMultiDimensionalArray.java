package day22_MultiDimensionalArray;

import java.util.Scanner;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int i=0; i<arr2D.length; i++)
        {
            for (int j = 0; j < arr2D[i].length; j++)
            {
                System.out.println(arr2D[i][j]);
            }
        }

    }
}
