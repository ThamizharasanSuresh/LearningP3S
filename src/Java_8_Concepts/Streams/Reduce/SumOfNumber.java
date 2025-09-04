package Java_8_Concepts.Streams.Reduce;

import java.util.Arrays;
import java.util.List;

public class SumOfNumber {
    public static void main(String[]args){
        List<Integer>st= Arrays.asList(1,2,3,4,5,6);
        int sum=st.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
