package www.bit.java;
public class Bubble {
    public static void main(String[] args) {
        int[] array = new int[]{4,5,6,3,2,1};
        bubbleSort(array);
        print(array);
    }
    public static void bubbleSort(int[] array){
        int temp = 0;
        for(int i = 0; i < array.length;i++){
            for(int j = 0;j < array.length - i - 1;j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void print(int[] array){
        for(int i= 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
