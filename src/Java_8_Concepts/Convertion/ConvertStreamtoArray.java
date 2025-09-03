package Java_8_Concepts.Convertion;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

// Convert the Stream to Array
// Convert the Array to Set
public class ConvertStreamtoArray {
    public static void main(String[]args){
        Stream<String>st=Stream.of("Js","thamizh","suresh","rolex");
        String []arr=st.toArray(String[]::new);
        Set<String>set=new HashSet<>();
        Collections.addAll(set,arr);
        set.forEach(n-> System.out.print(n+" "));
    }
}
