package Java_8_Concepts.Streams.Filter;

import java.util.*;
import java.util.List;

class Employee{
    String name;
    int age;
    Employee(String name,int age){
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
//From a list of employee objects (name, age), filter employees older than 25.
public class EmployeeAge {
    public static void main(String []args){
        List<Employee>ts=new ArrayList<>();
        ts.add(new Employee("Thamizh",21));
        ts.add(new Employee("Arasan",22));
        ts.add(new Employee("JS",20));
        ts.add(new Employee("suresh",45));
        ts.add(new Employee("sharmila",20));
        ts.add(new Employee("shalini",17));
        ts.stream().filter(s->s.getAge()>25).forEach(s-> System.out.println(s.getName()+" : "+s.getAge()));


    }
}
