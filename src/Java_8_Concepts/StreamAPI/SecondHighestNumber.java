package Java_8_Concepts.StreamAPI;

import java.util.*;

public class SecondHighestNumber {
    public static void main(String[]args){
        Scanner js=new Scanner(System.in);
        int s=js.nextInt();
        List<Integer>st=new ArrayList<>();
        for(int i=0;i<s;i++){
            st.add(js.nextInt());
        }
        Optional<Integer>res=st.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(res.get());
    }
}
