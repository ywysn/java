abstract class Person{
    //属性
    private String name;
    //普通方法
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    //抽象方法
    public abstract void getPersonInfo();
    public static Person getInstance(){
        //内部类（定义抽象类的子类)
        class Student extends Person{
            public void getPersonInfo(){
                System.out.println("I am a student");
            }
        }
        return new Student();
    }
}
public class B{
    public static void main(String[] args){
        //实例化子类，向上转型
        Person per = Person.getInstance();
        //被子类所覆写的方法
        per.getPersonInfo();
    }
}
