abstract class Person{
    //属性
    private String name;
    //构造方法
    public Person(){
        System.out.println("*******************");
    }
    //普通方法
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }
    //抽象方法
    public abstract void getPersonInfo();
}
class Student extends Person{
    //构造方法
    public Student(){
        System.out.println("######################");
    }
    //方法覆写
    public void getPersonInfo(){
    //空实现
    }
}
public class C{
    public static void main(String []args){
       new Student();
    }
}