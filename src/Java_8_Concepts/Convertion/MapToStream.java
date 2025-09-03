package Java_8_Concepts.Convertion;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapToStream {
    public static <k,v>Stream<v>convertmaptostream(Map<k,v> map){
        return map.values().stream();
    }
    public static void main(String[]args){
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Js");
        map.put(2,"Thamizh");
        map.put(3,"Arasan");
        map.put(4,"rolex");
        map.put(5,"sharmila");
        Stream<String>str=convertmaptostream(map);
        str.forEach(s-> System.out.println(s));
    }
}
