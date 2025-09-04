package Java_8_Concepts.RealTimeProgram;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String name;
    String dept;
    double sal;
    Employee(String n,String d,double s){
        name=n;
        dept=d;
        sal=s;
    }
    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public double getSal() {
        return sal;
    }
}
public class AverageSalaryDept {
    public static void main(String[]args){
        List<Employee> st=new ArrayList<>();
        st.add(new Employee("js","cse",45000));
        st.add(new Employee("Thamizh","cse",50000));
        st.add(new Employee("Arasan","IT",35000));
        st.add(new Employee("rolex","ece",40000));
        st.add(new Employee("suresh","IT",73000));
        st.add(new Employee("sharmila","eee",85000));
        st.add(new Employee("shalini","ece",65000));

        Map<String,Double>mp=st.stream().collect(Collectors.groupingBy(x->x.getDept(),Collectors.averagingDouble(x->x.getSal())));
        mp.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
