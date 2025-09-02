package Java_basics.Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_functionalInterface {
    public static void main(String[]args){
        List<String> st= Arrays.asList("JS","rolex","thamizh","arasan");
        Predicate<String> p=(s)->s.startsWith("r");
        for(String s:st){
            if(p.test(s)){
                System.out.println(s);
            }
        }

    }
}
