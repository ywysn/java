class Test{
    static{
       System.out.println("1.静态代码块***************");
    }
    public Test(){
       System.out.println("2.构造方法####################");
    }
    {
        System.out.println("3.代码块&&&&&&&&&&&&&&&&&");
    }
}
public class May{
    public static void main(String[] args){
      new Test();
      new Test(); 
      new Test();
    }
}