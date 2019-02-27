package www.bit.java;
//抽象类
abstract class Person {
    String name;
    int age;
    public abstract void fun();
    static abstract class Student {
        public abstract void fu();
    }
}
class B extends Person.Student{
    public void fu(){
        System.out.println("**********");
    }
}
public class A6 {
    public static void main(String[] args) {
        new B().fu();
    }
}