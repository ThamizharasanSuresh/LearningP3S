package Java_8_Concepts.StreamAPI;

import java.util.*;

class Emp{
    String name;
    double sal;
    Emp(String name,double sal){
        this.name=name;
        this.sal=sal;
    }

    public double getSal() {
        return sal;
    }

    public String getName() {
        return name;
    }
}
public class EmployeeHighSalary {
    public static void main(String[]args){
        List<Emp>em=new ArrayList<>();
        em.add(new Emp("thamizh",45000));
        em.add(new Emp("Arasan",25000));
        em.add(new Emp("Js",55000));
        em.add(new Emp("rolex",43000));
        em.add(new Emp("sharmila",30000));
        Optional<Emp> res=em.stream().max(Comparator.comparing(Emp::getSal));
        System.out.println(res.get().getName()+" : "+ res.get().getSal());
    }
}
