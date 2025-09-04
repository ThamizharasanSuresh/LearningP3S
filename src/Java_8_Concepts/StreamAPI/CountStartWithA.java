package Java_8_Concepts.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountStartWithA {
    public static void main(String[]args){
        Scanner js=new Scanner(System.in);
        int s=js.nextInt();
        List<String> st=new ArrayList<>();
        for(int i=0;i<s;i++){
            st.add(js.next());
        }
        Long res=st.stream().filter(n->n.startsWith("s")).count();
        System.out.println(res);
    }
}
