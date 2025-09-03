package Java_8_Concepts.Streams.ForEach;

import java.util.*;
public class KeyValue {
    public static void main(String[]args){
        Map<Integer,String>st=new HashMap<>();
        st.put(1,"rolex");
        st.put(2,"js");
        st.put(3,"thamizh");
        st.put(4,"arasan");
        st.entrySet().forEach((n)->{
            System.out.println(n.getKey()+" : "+n.getValue());
        });
    }
}
