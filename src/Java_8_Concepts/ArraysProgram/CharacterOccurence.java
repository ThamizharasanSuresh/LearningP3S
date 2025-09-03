package Java_8_Concepts.ArraysProgram;

import java.util.*;
import java.util.stream.Collectors;

public class CharacterOccurence {
    public static void main(String[]args){
        Scanner js=new Scanner(System.in);
        String s=js.next();
        Map<Character,Long>mp=s.chars().mapToObj(n->(char)n).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        mp.forEach((c,count)-> System.out.println(c+" : "+count));
    }
}
