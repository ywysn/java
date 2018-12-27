class Coffee{
    void prepare(){
        boilWater();
        brewCoffeeGrings();
        pourInCup();
        addSugarAndMilk();
    }
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void brewCoffeeGrings(){
        System.out.println("冲咖啡");
    }
    public void pourInCup(){
        System.out.println("将咖啡倒入杯中");
    }
    public void addSugarAndMilk(){
        System.out.println("加糖或者牛奶");
    }
}
class Tea{
    void prepare(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }
    public void boilWater(){
        System.out.println("把水烧开");
    }
    public void steepTeaBag(){
         System.out.println("泡茶包");
    }
    public void pourInCup(){
        System.out.println("倒入杯中");
    }
    public void addLemon(){
         System.out.println("加柠檬");
    }
}
public class D{
    public static void main (String[]args){
        Coffee coffee = new Coffee();
        coffee.prepare();
        Tea tea = new Tea();
        tea.prepare();
    }
}