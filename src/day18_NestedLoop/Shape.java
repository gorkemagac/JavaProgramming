package day18_NestedLoop;

import java.sql.SQLOutput;

public class Shape {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
