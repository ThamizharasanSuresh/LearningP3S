//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Zeroparameter{
    void disp();
}
public class Main {
    public static void main(String[] args) {
        Zeroparameter zero= () ->{System.out.println("This is zero parameter");};
        zero.disp();
    }
}
