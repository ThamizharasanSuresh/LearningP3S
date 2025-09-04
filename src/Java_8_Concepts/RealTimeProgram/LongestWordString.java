package Java_8_Concepts.RealTimeProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestWordString {
    public static void main(String[]args){
        List<String>st= Arrays.asList("Wonderland","Beautiful","Gorgious","Thamizh");
        Optional<String> res=st.stream().max(Comparator.comparing(s->s.length()));
        System.out.println(res.get());
    }
}
