package Java_8_Concepts.Convertion;

import java.util.*;
import java.util.stream.Stream;

public class ConvertSettoStream {
    public static void main(String[]args){
        Set<String>st=new LinkedHashSet<>();
        st.add("JS");
        st.add("thamizh");
        st.add("rolex");
        st.add("arasan");
        st.add("suresh");
        Stream<String> str=st.stream();
        str.forEach(s-> System.out.println(s));
    }
}
