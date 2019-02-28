package www.bit.java;
class Singal{
    private static Singal singal = new Singal();
    private Singal(){
    }
    public static Singal getInstance(){
        return singal;
    }
    public void print(){
        System.out.println("恶汉式单例");
    }
}
public class A9 {
    public static void main(String[] args) {
        Singal singal = null;
        singal = Singal.getInstance();
        singal.print();
    }
}
