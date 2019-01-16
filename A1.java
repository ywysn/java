package www.bit.java;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.PI;
public class A1 {
    public static void main(String[] args) {
        //控制小数位数，小数位数为7
        DecimalFormat df = new DecimalFormat("0.0000000");
        //从屏幕上获取数字
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        //计算圆的面积
        double Area = PI*r*r;
        System.out.println(df.format(Area));
    }
}