package Java_8_Concepts.LambdaExpression;

import java.util.ArrayList;

public class Singleparameter {
    public static void main(String []args){
        ArrayList<Integer>st=new ArrayList<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);

        st.forEach(n->System.out.println(n));
        System.out.println("Even numbers");
        st.forEach(n->{
            if(n%2==0){
                System.out.print(n+" ");
            }
        });
    }
}
