public class BubbleSort {
    public static void main(String[] args) {
        GenerateArray ger  = new GenerateArray();
        ArrayOutput out = new ArrayOutput();
        int []arr = ger.generateRandomArray(6,1,100);
        //bubbleSort(arr);
        bubbleSortUp(arr);
        out.arrayOutput(arr);
    }
    public static void bubbleSort(int []array){
        int n = array.length;
        if(n <= 1){
            return;
        }else{
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n-i-1;j++){
                    if(array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }
    public static void bubbleSortUp(int[] array){
        int n = array.length;
        if(n <= 1){
            return;
        }else{
            for(int i = 0;i < n;i++){
                boolean flag = false;
                for(int j = 0;j < n-i-1;j++){
                    if(array[j] > array[j+1]){
                        flag = true;
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
                if(!flag){
                    break;
                }
            }
        }
    }
}
