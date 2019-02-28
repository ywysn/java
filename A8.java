package www.bit.java;
class Person{
    public void fun(){
        {//普通代码块
            String name;
            int age;
        }
    }
    static{
        System.out.println("非主类中的静态代码块");
    }
    {
        System.out.println("构造块");
    }

}
public class A8{
    static{
        System.out.println("主类中的静态代码块");
    }
    public static void main(String[] args) {
        new Person();
    }
}