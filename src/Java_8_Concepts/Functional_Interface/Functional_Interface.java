package Java_8_Concepts.Functional_Interface;

// using the function interface with lambda expression.
interface Message{
    void showmsg(String s);
}
public class Functional_Interface {
    public static void main(String [] args){
        Message msg=(s)->{
            System.out.println("Java_8_Concepts.Functional_Interface.Message : "+s);
        };
        msg.showmsg("Hi! This is Rolex");
    }
}
