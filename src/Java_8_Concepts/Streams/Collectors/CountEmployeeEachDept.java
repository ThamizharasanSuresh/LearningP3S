package Java_8_Concepts.Streams.Collectors;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1{
    String name;
    String dept;
    Employee1(String n,String d){
        name=n;
        dept=d;
    }


}
public class CountEmployeeEachDept {
    public static void main(String[]args){
        List<Employee1> st=new ArrayList<>();
        st.add(new Employee1("js","cse"));
        st.add(new Employee1("Thamizh","cse"));
        st.add(new Employee1("Arasan","IT"));
        st.add(new Employee1("rolex","ece"));
        st.add(new Employee1("suresh","IT"));
        st.add(new Employee1("sharmila","eee"));
        st.add(new Employee1("shalini","ece"));

        Map<String,List<Employee1>>mp=st.stream().collect(Collectors.groupingBy(e->e.dept));
        mp.forEach((k,v)-> System.out.println(k+" : "+v.stream().count()));
    }
}
