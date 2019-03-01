package www.bit.java;
abstract class A{
    public abstract void print();
}
interface B{
    void fun();
}
class C extends A implements B{
    public void print(){
        System.out.println("***********");
    }

    @Override
    public void fun() {
        System.out.println("%%%%%%%%%%%");
    }
}
public class A13 {
    public static void main(String[] args) {
        A a = new C();
        B b = (B)a;
        b.fun();
        a.print();

    }
}
