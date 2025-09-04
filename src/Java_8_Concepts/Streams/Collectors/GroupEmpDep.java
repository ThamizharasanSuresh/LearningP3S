package Java_8_Concepts.Streams.Collectors;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String name;
    String dept;
    Employee(String n,String d){
        name=n;
        dept=d;
    }
    @Override
    public String toString(){
        return name;
    }

}
public class GroupEmpDep {
    public static void main(String[]args){
        List<Employee>st=new ArrayList<>();
        st.add(new Employee("js","cse"));
        st.add(new Employee("Thamizh","cse"));
        st.add(new Employee("Arasan","IT"));
        st.add(new Employee("rolex","ece"));
        st.add(new Employee("suresh","IT"));
        st.add(new Employee("sharmila","eee"));
        st.add(new Employee("shalini","ece"));

        Map<String,List<Employee>>mp=st.stream().collect(Collectors.groupingBy(e->e.dept));
        mp.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
