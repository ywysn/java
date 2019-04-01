public class MergeSort {
    public static void main(String[] args) {
        GenerateArray ger  = new GenerateArray();
        ArrayOutput out = new ArrayOutput();
        //int []arr = ger.generateRandomArray(6,1,100);
        int[] arr = new int[]{1,6,5,2,3,4};
        mergeSortIntern(arr,0,5);
        out.arrayOutput(arr);
    }
    private static void mergeSortIntern(int[] array,int p,int r) {
        if(p >= r){
            return;
        }
        int mid = (p+r)/2;
        mergeSortIntern(array,p,mid);
        mergeSortIntern(array,mid+1,r);
        merge(array,p,mid,r);
    }
    private static void merge(int[] array,int p,int mid,int r) {
        int i = p;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[r-p+1];
        while(i <= mid && j <= r){
            if(array[i] > array[j]){
                temp[k++] = array[j++];
            }else {
                temp[k++] = array[i++];
            }
        }
        int start = i;
        int end = mid;
        if(j <= r){
            start = j;
            end = r;
        }
        while (start <= end){
            temp[k++] = array[start++];
        }
        for(i = 0;i <= r-p;i++){
            array[p+i] = temp[i];
        }
    }
}
