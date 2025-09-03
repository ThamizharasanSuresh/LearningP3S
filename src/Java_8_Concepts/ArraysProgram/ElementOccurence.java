package Java_8_Concepts.ArraysProgram;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElementOccurence {
    public static void main(String[]args){
        Scanner js=new Scanner(System.in);
        int s=js.nextInt();
        Integer arr[]=new Integer[s];
        for(int i=0;i<s;i++){
            arr[i]=js.nextInt();
        }
        Map<Integer,Long>mp=Arrays.stream(arr).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        mp.forEach((c,k)-> System.out.println(c+" : "+k));
    }
}
