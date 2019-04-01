import com.sun.xml.internal.ws.message.source.PayloadSourceMessage;

public class BinaryInsertSort {
    public static void main(String[] args) {
        GenerateArray ger  = new GenerateArray();
        ArrayOutput out = new ArrayOutput();
        int []arr = ger.generateRandomArray(5,1,100);
        binaryInsertSort(arr);
       out.arrayOutput(arr);
    }
    public static void binaryInsertSort(int[] array){
        long start = System.currentTimeMillis();
        if (array.length <= 1) {
            return;
        }
        else {
            int n = array.length;
            int mid,low,high,j = 0;
            for(int i = 1;i < n;i++){
                int temp = array[i];
                low = 0;
                high = i-1;
                while(low <= high){
                    mid = (low+high)/2;
                    if(temp < array[mid]){
                        high = mid-1;
                    }else {
                        low = mid+1;
                    }
                }
                for ( j = i-1;j > high;j--){
                    array[j+1] = array[j];
                }
                array[j+1] = temp;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("折半插⼊入排序共耗时:"+(end - start)+"毫秒");
    }
}
