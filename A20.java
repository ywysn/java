package www.bit.java;

public class A20 {
    public static void main(String[] args) {
        String str = "hello world";
        char[] data = str.toCharArray();
        for (int i = 0;i < data.length;i++){
            data[i] -= 32;
            System.out.println(data[i]+",");
        }
        System.out.println(new String(data));
        System.out.println(new String(data,5,5));
    }
}
