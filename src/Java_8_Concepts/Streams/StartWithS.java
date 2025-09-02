package Java_8_Concepts.Streams;

import java.util.*;
import java.util.ArrayList;

public class StartWithS {
    public static void main(String []args){
        Scanner js=new Scanner(System.in);
        System.out.println("Enter the list size");
        int si=js.nextInt();
        System.out.println("Enter the Element");
        List<String>st=new ArrayList<>();
        for(int i=0;i<si;i++){
            st.add(js.next());
        }
        st.stream().filter(s->s.startsWith("s")).forEach(System.out::println);
    }
}
