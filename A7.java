package www.bit.java;
abstract class A{
    public A(){//3.调用父类构造方法
        this.print();//4.调用父类抽象方法
    }
    public abstract void print();//4.
}
class B extends A{
    private int num = 10;
    public B(int num){//2.调用子类构造方法
        super();//3.
        this.num = num;
    }
    public void print(){//5.调用子类覆写后的方法
        System.out.println(this.num);//6.
    }
}
public class A7 {
    public static void main(String[] args) {
        new B(30);//1.实例化子类对象
    }
}
