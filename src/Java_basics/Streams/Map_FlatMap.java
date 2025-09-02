package Java_basics.Streams;

import java.util.*;
import java.util.List;

public class Map_FlatMap {
    public static void main(String [] args){
        List<String>ts=new ArrayList<>();
        ts.add("Thamizh");
        ts.add("Arasan");
        ts.add("JS");
        ts.add("rolex");
        ts.add("suresh");
        ts.add("sharmila");
        ts.stream().filter(s->s.length()>=3).map(s->s.toUpperCase()).forEach(s->System.out.print(s+" "));
        System.out.println();
        List<List<Integer>>st=new ArrayList<>();
        st.add(Arrays.asList(1,2));
        st.add(Arrays.asList(2,3));
        st.add(Arrays.asList(4,5));
        st.add(Arrays.asList(8,9));
        st.add(Arrays.asList(6,7));
        st.stream().flatMap(l->l.stream()).distinct().sorted().forEach(System.out::print);
    }
}
