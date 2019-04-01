public class SelectSort {
    public static void main(String[] args) {
        GenerateArray ger  = new GenerateArray();
        ArrayOutput out = new ArrayOutput();
        int []arr = ger.generateRandomArray(6,1,100);
        selectSort(arr);
        out.arrayOutput(arr);
    }
    public static void selectSort(int[] array){
        int n = array.length;
        if(n <= 1){
            return;
        }else {
            for (int i = 0;i < n-1;i++){
                int midIndex = i;
                for(int j = i+1;j < n;j++){
                    if(array[midIndex] > array[j]){
                        midIndex = j;
                    }
                }
                int temp = array[i];
                array[i] = array[midIndex];
                array[midIndex] = temp;
            }
        }
    }
}
