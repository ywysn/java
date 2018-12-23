abstract class Person{
    //私有属性
    private String name;
    //获取
    public String getName(){
        return this.name;
    }
    //改变
    public  void setName(String name){
        this.name = name;
    }
    //抽象方法
    public abstract void getPersonInfo();
}
//子类继承父类
class Student extends Person{
    //方法覆写
    public void getPersonInfo(){
        System.out.println("I am astudent");
    }
}
public class A{
    public static void main(String[]args){
        //子类实例化，向上转型
        Person per = new Student();
        //被子类所覆写的方法
        per.getPersonInfo();
    }
}