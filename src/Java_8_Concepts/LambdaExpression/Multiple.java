package Java_8_Concepts.LambdaExpression;

interface Multipleparameter{
   int operation(int a,int b);
}
public class Multiple {
    public static void main(String [] args){
        Multipleparameter add=(a,b)->a+b;
        Multipleparameter mul=(a,b)->a*b;
        System.out.println(add.operation(2,3));
        System.out.println(mul.operation(4,5));
    }
}
