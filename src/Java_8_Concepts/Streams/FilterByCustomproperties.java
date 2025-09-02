package Java_8_Concepts.Streams;

import java.util.*;
import java.util.ArrayList;

public class FilterByCustomproperties {
    public static boolean Palindrome(String s){
        if(s.length()<=1) return true;
        else{
            return (s.charAt(0)==s.charAt(s.length()-1))&&Palindrome(s.substring(1,s.length()-1));
        }
    }
    public static void main(String [] args){
        Scanner js=new Scanner(System.in);
        System.out.println("Enter the List size");
        int len=js.nextInt();
        List<String>st=new ArrayList<>();
        for(int i=0;i<len;i++){
            st.add(js.next());
        }
        st.stream().filter(x->Palindrome(x)).forEach(System.out::println);
    }
}
