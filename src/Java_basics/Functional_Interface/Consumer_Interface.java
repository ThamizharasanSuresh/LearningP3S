package Java_basics.Functional_Interface;
import java.util.*;
import java.util.function.Consumer;


public class Consumer_Interface {
    public static void main(String []args){
        Consumer<Integer> disp= a-> System.out.println(a);
        Consumer<List<Integer>>modify= list -> {
            for(int i=0;i<list.size();i++){
                list.set(i,2*list.get(i));
            }
        };
        Consumer<List<Integer>> displist=list->list.stream().forEach(s-> System.out.print(s+" "));
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(10);
        modify.accept(list);
        displist.accept(list);
        modify.andThen(displist).accept(list);
    }
}
