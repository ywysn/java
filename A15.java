package www.bit.java;
interface A{
    void print();
}
interface B{
    void fun();
}
interface C extends A,B{
    void happy();
}
class D implements C{
    @Override
    public void happy() {
        System.out.println("88888888");
    }

    @Override
    public void print() {
        System.out.println("*********");
    }

    @Override
    public void fun() {
        System.out.println("&&&&&&&&&");
    }
}
public class A15 {
    public static void main(String[] args) {
        new D();
    }
}
