abstract class CaffeinBeverage{
    final void prepareRecipe(){
        boliWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    void boliWater(){
        System.out.println("烧水");
    }
    void pourInCup(){
        System.out.println("倒入杯中");
    }
}
class Tea extends CaffeinBeverage{
    void brew(){
        System.out.println("泡茶 ");
    }
    void addCondiments(){
        System.out.println("加柠檬");
    }
}
class Coffee extends CaffeinBeverage{
        void brew(){
        System.out.println("冲咖啡 ");
    }
    void addCondiments(){
        System.out.println("加糖
        或牛奶");
    }
}
public class E{
    public static void main (String[] args){
     CaffeinBeverage coffee = new Coffee();
     coffee.prepareRecipe();
     CaffeinBeverage tea = new Tea();
     tea.prepareRecipe();
    }
}