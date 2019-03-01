package www.bit.java;
interface A{
    void print();
}
interface B{
    void fun();
}
interface C{
    void happy();
}
class D implements A,B,C{
    @Override
    public void print() {
        System.out.println("我是A");
    }

    @Override
    public void fun() {
        System.out.println("我是B");
    }

    @Override
    public void happy() {
        System.out.println("我是C");
    }
}
public class A11 {
    public static void main(String[] args) {
     D d = new D();
     d.happy();
     d.fun();
     d.print();
    }
}
