package Java_8_Concepts.Streams.Filter;

import java.util.*;

public class PrimeNumbers {
    public static void main(String []args){
        Scanner js=new Scanner(System.in);
        int s=js.nextInt();
        List<Integer>st=new ArrayList<>();
        for(int i=0;i<s;i++){
            st.add(js.nextInt());
        }
        st.stream().filter(n->{
                    if(n<1) return false;
                    for(int i=2;i<=n/2;i++){
                        if(n%i==0){
                            return false;
                        }
                    }
                    return true;
        }
        ).forEach(n-> System.out.print(n+" "));
    }
}
