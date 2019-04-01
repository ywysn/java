import java.util.Random;

public class GenerateArray {
    public static void main(String[] args) {
       // int arr[] = generateRandomArray(6,1,100);
    }
    public static int[] generateRandomArray(int n,int rangeL,int rangR){
        assert rangeL <= rangR;
        int []arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = new Integer((new Random().nextInt(rangR-rangeL+1)+rangeL));
        }
        return arr;
    }
}
