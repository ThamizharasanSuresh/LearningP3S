import java.util.*;
import java.util.ArrayList;

class Person{
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class MethodReference {
        public static int comparebyname(Person a,Person b){
            return a.getName().compareTo(b.getName());
        }
    public static int compareByage(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }
    public static void main(String []args){
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Rolex",21));
        personList.add(new Person("Thamizh",22));
        personList.add(new Person("JS",19));
        personList.add(new Person("Sabari",21));

        Collections.sort(personList,MethodReference::comparebyname);
        System.out.println("sort by name");
        personList.stream().map(n->n.getName()).forEach(System.out::println);

        Collections.sort(personList,MethodReference::compareByage);
        System.out.println("sort by age");
        personList.stream().map(n->n.getAge()).forEach(System.out::println);

    }
}
