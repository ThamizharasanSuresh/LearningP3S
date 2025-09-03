package Java_8_Concepts.Streams.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LengthOfNames {
    public static void main(String[]args){
        Scanner js=new Scanner(System.in);
        int s=js.nextInt();
        List<String> st=new ArrayList<>();
        for(int i=0;i<s;i++){
            st.add(js.next());
        }
        st.stream().map(n->n.length()).forEach(n-> System.out.print(n+" "));
    }
}
