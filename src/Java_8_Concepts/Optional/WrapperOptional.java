package Java_8_Concepts.Optional;
import java.util.*;
public class WrapperOptional {
    public static void main(String[]args){
        List<String>st=Arrays.asList("rolex","thamizh","sharmila","suresh","shalini");
        Optional<String>res=st.stream().filter(s->s.startsWith("s")).findFirst();
        System.out.println(res.get());
    }
}
