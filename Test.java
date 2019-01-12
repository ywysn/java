import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Arrays;

public class Test {
    private static int Fib(int i) {
        if(i==1|i==2){
            return 1;
        }else {
            return Fib(i-1)+Fib(i-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("斐波那契数列的前20项为：");
            System.out.println(Fib(10));
    }
}