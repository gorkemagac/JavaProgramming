package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron","Ahmed","David","Shay"));
        employees.retainAll(Arrays.asList("Ahmed","David"));
        System.out.println(employees);

        System.out.println("--------------------------");
        String[] names ={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};

        ArrayList<String> newNames = new ArrayList<>(Arrays.asList(names));

        newNames.removeIf(p-> p.charAt(0)=='M');

        System.out.println(newNames);

        names = newNames.toArray(new String[0]);

    }
}
