package www.bit.java;
interface A{
   public void print();
    static interface B{
        void fun();
    }
}
class C implements A.B{
    public void fun(){
        System.out.println("blablabla");
    }
}
public class A16 {
    public static void main(String[] args){
        new C().fun();
    }
}
