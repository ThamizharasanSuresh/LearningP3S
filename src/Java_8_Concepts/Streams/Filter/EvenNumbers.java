package Java_8_Concepts.Streams.Filter;

import java.util.*;
import java.util.List;
import java.util.Scanner;

//Write a program to filter out even numbers from a list of integers
public class EvenNumbers {
    public static void main(String [] args){
        Scanner js=new Scanner(System.in);
        int s=js.nextInt();
        List<Integer> st=new ArrayList<>();
        for(int i=0;i<s;i++){
            st.add(js.nextInt());
        }
        st.stream().filter(n->n%2==0).forEach(System.out::print);
    }
}
