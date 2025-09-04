package Java_8_Concepts.Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_functionalInterface {
    public static void main(String[]args){
        List<String> st= Arrays.asList("JS","rolex","thamizh","arasan");
        Predicate<String> p=(s)->s.startsWith("r");
        Predicate<Integer>even=(s)->s%2==0; // Even or Odd.
        for(String s:st){
            if(p.test(s)){
                System.out.println(s);
            }
        }
        System.out.println(even.test(12)?"Even":"Odd");

    }
}
