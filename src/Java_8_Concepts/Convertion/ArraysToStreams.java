package Java_8_Concepts.Convertion;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysToStreams {
    public static <T> Stream<T>convertarrtostream(T arr[]){
        return Arrays.stream(arr);
    }
    public static void main(String[]args){
        Integer arr[]={1,2,3,4,5,6,7};
        Stream<Integer>str=convertarrtostream(arr);
        str.forEach(n-> System.out.println(n));
    }
}

