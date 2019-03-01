package www.bit.java;
interface A{
    void print();
}
abstract class B implements A{
    public abstract void fun();
}
class C extends B{
    @Override
    public void print() {
        System.out.println("*****");
    }

    @Override
    public void fun() {
        System.out.println("%%%%%%");
    }
}
public class A14 {
    public static void main(String[] args) {
        A a = new C();
        a.print();
        B b = (B)a;
        b.fun();
    }
}
