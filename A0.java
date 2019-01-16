package www.bit.java;

import java.util.Scanner;

public class A0 {
    public static void main(String[] args) {
        //从屏幕上获取数字
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            //将所获取的数字作为数组的长度
            int[] remainder = new int[n];
            //控制n的范围
            if (1 <= n && n <= 1000000) {
                //设定第一个和第二个斐波那契数的值
                if (n == 1 || n == 2) {
                    remainder[n - 1] = 1;
                } else {
                    //获取余数，将余数存入数组中
                    for (int i = 2; i < n; i++) {
                        remainder[0] = 1;
                        remainder[1] = 1;
                        remainder[i] = (remainder[i - 1] + remainder[i - 2]) % 10007;
                    }
                }
            }
            System.out.println(remainder[n - 1]);
    }
}