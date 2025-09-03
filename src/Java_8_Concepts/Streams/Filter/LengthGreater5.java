package Java_8_Concepts.Streams.Filter;

import java.util.*;

//From a list of names, filter only those names whose length is greater than 5
public class LengthGreater5 {
    public static void main(String []args){
        Scanner js=new Scanner(System.in);
        int s=js.nextInt();
        List<String> st=new ArrayList<>();
        for(int i=0;i<s;i++){
            st.add(js.next());
        }
        st.stream().filter(n->n.length()>5).forEach(n-> System.out.print(n+" "));
    }
}
