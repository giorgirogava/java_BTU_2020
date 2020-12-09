package Practical_4.demo1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyCollections {
    public static void main(String[] args) {


        Set<String> set = new TreeSet<>();

        set.add("samsung");
        set.add("Sony");
        set.add("HTC");
        set.add("Lenovo");
        set.add("Sony"); // duplicate element
        set.add("HTC"); //  duplicate element

        for (String item : set) {
            System.out.println(item);
        }

    }
}
