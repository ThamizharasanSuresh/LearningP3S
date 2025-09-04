package Java_8_Concepts.RealTimeProgram;

import java.util.ArrayList;
import java.util.List;

class Transaction{
    String product;
    double amt;
    Transaction(String product,double amt){
        this.product=product;
        this.amt=amt;
    }

    public String getProduct() {
        return product;
    }

    public double getAmt() {
        return amt;
    }
}
public class SumOfSpentTransaction {
    public static void main(String[]args){
        List<Transaction>st=new ArrayList<>();
        st.add(new Transaction("Pen",20));
        st.add(new Transaction("Pencil",30));
        st.add(new Transaction("Paper",25));
        st.add(new Transaction("Water Bottle",90));
        st.add(new Transaction("NoteBook",150));

        double res=st.stream().map(x->x.getAmt()).reduce(0.0,(a,b)->a+b);
        System.out.println(res);
    }
}
