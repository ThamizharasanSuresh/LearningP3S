package Java_8_Concepts.Comparator_Comparable;

import java.util.*;
class Person implements Comparable<Person>{
    int id;
    String name;
    int age;
    Person(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }
    public String toString(){
        return id+" -"+name+"-"+age;
    }
}
public class Comparable1 {
    public static void main(String[]args){
        List<Person>st=new ArrayList<>();
        st.add(new Person(3,"thamizh",21));
        st.add(new Person(1,"Rolex",22));
        st.add(new Person(2,"Js",23));

        Collections.sort(st);
        System.out.println(st);


    }
}
