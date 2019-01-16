package www.bit.java;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = 0;
        num = (n*(n+1))/2;
        System.out.println(num);
    }
}
