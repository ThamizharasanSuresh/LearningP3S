package Java_8_Concepts.ArraysProgram;

import java.util.*;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[]args){
        Scanner js=new Scanner(System.in);
        int s=js.nextInt();
        Integer[]st=new Integer[s];
        for(int i=0;i<s;i++){
            st[i]=js.nextInt();
        }
        Integer[]rev= IntStream.range(0,st.length).mapToObj(i->st[st.length-i-1]).toArray(Integer[]::new);
        System.out.println(Arrays.toString(rev));
    }
}
