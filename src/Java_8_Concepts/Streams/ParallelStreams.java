package Java_8_Concepts.Streams;

import java.util.*;
public class ParallelStreams {
    public static void main(String [] args){
        List<String>st=Arrays.asList("thamizh","arasan","rolex","js","suresh");
        st.parallelStream().forEach(s->System.out.print(s+" "));
        System.out.println();
        st.parallelStream().forEachOrdered(s->System.out.print(s+" "));
    }
}
