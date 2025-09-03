package Java_8_Concepts.Comparator_Comparable;

import java.util.*;

class Person1{
    int id;
    String name;
    int age;
    Person1(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return id+" -"+name+"-"+age;
    }
}
public class Comparator1 {
    public static void main(String[]args){
        List<Person1> st=new ArrayList<>();
        st.add(new Person1(3,"thamizh",21));
        st.add(new Person1(1,"Rolex",22));
        st.add(new Person1(2,"Js",23));
        st.sort(Comparator.comparing(n->n.name));
        System.out.println(st);
        st.sort((n1,n2)->n2.age-n1.age);
        System.out.println(st);

    }
}
