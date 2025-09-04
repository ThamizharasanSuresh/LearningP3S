package Java_8_Concepts.Optional;

import java.util.Optional;

public class AvoidNullPointer {
    public static void main(String[]args){
        String st=null;
        Optional<String>res=Optional.ofNullable(st);
        System.out.println(res.orElse("ROlex"));
    }
}
