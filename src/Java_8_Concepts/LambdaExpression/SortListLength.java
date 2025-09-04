package Java_8_Concepts.LambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListLength {
    public static void main(String[]args){
        List<String>st= Arrays.asList("Thamizh","js","arasan","rolex");
        st.sort(Comparator.comparing(s->s.length()));
        System.out.println(st);
    }
}
