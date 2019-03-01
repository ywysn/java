package www.bit.java;
interface A{
    public static final String MSG = "blablabla";//全局常量
    public abstract void print();//抽象方法
}
interface B{
    public abstract String fun();
}
class D implements A,B{
    @Override
    public void print() {
        System.out.println(A.MSG);
    }

    @Override
    public String fun() {
        return A.MSG;
    }
}
public class A12 {
    public static void main(String[] args) {
        A a = new D();//向上转型，为父接口实例化对象
        a.print();//调用被覆写后的方法
        B b = (B) a;
        System.out.println(b.fun());
    }
}