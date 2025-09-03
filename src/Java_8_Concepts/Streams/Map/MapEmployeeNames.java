package Java_8_Concepts.Streams.Map;

import java.util.*;
import java.util.stream.Collectors;

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class MapEmployeeNames {
    public static void main(String[]arga){
        List<Person>st=new ArrayList<>();
        st.add(new Person("thamizh",21));
        st.add(new Person("arasan",20));
        st.add(new Person("js",22));
        st.add(new Person("rolex",34));
        List<String>names=st.stream().map(n->n.getName()).collect(Collectors.toList());
        names.forEach(n-> System.out.println(n));
    }
}
