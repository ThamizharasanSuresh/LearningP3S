package Java_8_Concepts.Streams;

import java.util.*;
import java.util.ArrayList;

public class SortedList {
    public static void main(String [] args){
        List<String>st=new ArrayList<>();
        st.add("Thamizh");
        st.add("Arasan");
        st.add("JS");
        st.add("Rolex");
        st.stream().sorted().forEach(s-> System.out.print(s+" "));

        List<Integer>ts=new ArrayList<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);
        ts.add(7);
        List<Integer>ts1=new ArrayList<>();
        ts1.add(1);
        ts1.add(3);
        ts1.add(5);
        ts1.add(7);
        ts1.stream().filter(s->s%2==0).forEach(s-> System.out.print(s+" "));
    }
}

