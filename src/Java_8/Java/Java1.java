package Java_8.Java;

import java.util.Arrays;

interface Printer{
    void print();
    default void print1(String name,Integer rno){
        System.out.println("Name : "+name+"\nRoll No : "+rno);
    }
}
interface ArrayOper{
    void operate(int [] arr);
}
interface Numbercheck{
    void check(int a);
}
interface DayofWeek{
    String day(int date);
}
interface Calculator{
    int perform(int a,int b);
}
interface CharVowel{
    String vowelorconsonant(char i);
}
interface Table{
    void gettable(int n);
}
interface Digit{
    int sumofdigit(int n);
}
interface Factorial{
    int fact(int n);
}

public class Java1 {
    public static void main(String [] args){
        System.out.println("Print the String!!!");
        Printer p=()-> System.out.println("Hello, java");
        p.print();
        System.out.println("Print the Student data");
        p.print1("Thamizh",21);
        System.out.println("Print the max and min element in array");
        ArrayOper a=(arr)->{
          int min= Arrays.stream(arr).min().getAsInt();
          int max=Arrays.stream(arr).max().getAsInt();
          System.out.println("Max : "+max+"\nMin : "+min);
        };
        int ar1[]={2,56,7,90,13,3};
        int rev[]={1,2,3,4,5,6,7};
        a.operate(ar1);
        System.out.println("Print the reverse the array");
        ArrayOper revers=(int arr[])->{
            int len=arr.length;
            for(int i=len-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        };
        revers.operate(rev);
        System.out.println("Print sum and average of number");
        ArrayOper sumandavg=(int arr[])->{
            int len=arr.length;
            int sum=0;
            sum=Arrays.stream(arr).sum();
            int avg=sum/len;
            System.out.println("Average : "+avg+"\nTotal sum : "+sum);
        };
        int arr2[]={2,4,6,8,10,12};
        sumandavg.operate(arr2);
        System.out.println("Search element");
        ArrayOper search=(arr)->{
            int k=23;
            boolean res=Arrays.stream(arr).anyMatch(n->n==k);
            System.out.println(res?"found":"not found");
        };
        int arr3[]={22,14,16,78,23,45,68};
        search.operate(arr3);

        System.out.println("Number is Positive or Negative or Zero");
        Numbercheck pnz=(n)->{
            String st=(n>0)?"Positive":(n<0)?"Negative":"Zero";
            System.out.println(n+" is a "+st);
        };
        pnz.check(54);
        System.out.println("Check number is even or odd");
        Numbercheck evenorodd=(n)->{
            String rs=(n%2==0)?"Even":"Odd";
            System.out.println(n+ " is a " +rs);
        };
        evenorodd.check(67);

        DayofWeek dayfind=(n)->{
            switch (n){
                case 1:return "Monday";
                case 2:return "Tuesday";
                case 3:return "Wednesday";
                case 4:return "Thursday";
                case 5:return "Friday";
                case 6:return "Saturday";
                case 7:return "Sunday";
                default:return "Invalid Date Enter(1-7)";
            }
        };
        System.out.println(dayfind.day(5));
        Calculator add=(c,b)->{return c+b;};
        Calculator sub=(c,b)->{return (c>b)?c-b:b-c;};
        Calculator mul=(c,b)->{return c*b;};
        Calculator div=(c,b)->{return (c>b)?c/b:b/c;};

        System.out.println(add.perform(2,3));
        System.out.println(sub.perform(4,5));
        System.out.println(mul.perform(5,6));
        System.out.println(div.perform(2,6));

        CharVowel ch=(n)->{
          String res=(n=='a'||n=='e'||n=='i'||n=='o'||n=='u') ?"Vowel":"Consonant";
          return res;
        };
        System.out.println(ch.vowelorconsonant('a'));

        Table t=(n)->{
            System.out.println("Table of "+n);
            for(int i=1;i<=10;i++){
                System.out.println(i+"x"+n+"="+i*n);
            }
        };
        t.gettable(5);

        System.out.println("Sum of Digits of number");
        Digit d=(n)->{
            int sum=0;
            while(n>0){
                int di=n%10;
                sum+=di;
                n/=10;
            }
            return sum;
        };
        System.out.println(1234+" : "+d.sumofdigit(1234));
        System.out.println("Print the number from 1 to 5 using the do-while loop");
        Printer numprint=()->{
            int i=1;
            do{
                System.out.println(i+" ");
                i++;
            }while (i<=5);
        };
        numprint.print();
        System.out.println("Check number is prime or not");
        Numbercheck isprime=(n)->{
            int m=0;
            if(n<1) m=1;
            for(int i=2;i<=n/2;i++){
                if(n%i==0) m=1;
                break;
            }
            String pri=(m==0)?"Prime":"Not Prime";
            System.out.println(pri);
        };
        isprime.check(7);

        System.out.println("Factorial of Numbers");
        Factorial res=(n)->{
            int f=1;
            for(int i=1;i<=n;i++){
                f*=i;
            }
            return f;
        };
        System.out.println(res.fact(5));


    }
}
