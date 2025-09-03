package Java_8_Concepts.Streams.ForEach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EachStringLength {
    public static void main(String[]args){
        Scanner js=new Scanner(System.in);
        int s=js.nextInt();
        List<String> st=new ArrayList<>();
        for(int i=0;i<s;i++){
            st.add(js.next());
        }
        st.forEach(n-> System.out.println(n+" : "+n.length()));
    }
}
