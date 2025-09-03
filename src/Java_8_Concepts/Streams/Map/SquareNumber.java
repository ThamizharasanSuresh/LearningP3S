package Java_8_Concepts.Streams.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquareNumber {
    public static void main(String[]args){
        Scanner js=new Scanner(System.in);
        int s=js.nextInt();
        List<Integer> st=new ArrayList<>();
        for(int i=0;i<s;i++){
            st.add(js.nextInt());
        }
        st.stream().map(n->n*n).forEach(n-> System.out.print(n+" "));
    }
}
