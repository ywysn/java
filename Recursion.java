package www.bit.java;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sum(num - 1);
        }
    }
}
