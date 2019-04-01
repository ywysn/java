public class QuickSort {
    public static void main(String[] args) {
        GenerateArray ger  = new GenerateArray();
        ArrayOutput out = new ArrayOutput();
        //int []arr = ger.generateRandomArray(6,1,100);
        int[] arr = new int[]{1,6,5,2,3,4};
        quickSortInternal(arr,0,5);

        out.arrayOutput(arr);
    }
    private static void quickSortInternal(int[] array,int p,int r) {
        if(p >= r){
            return;
        }
        //int q = partition(array,p,r);
        //int q = partitionDouble(array,p,r);
        int q = partitionT(array,p,r);
        quickSortInternal(array,p,q-1);
        quickSortInternal(array,q+1,r);
    }
    private static int partition(int[] array,int l,int r) {
        //int v = array[l];
        int randomIndex = (int) (Math.random()*(r-l+1) + l);
        swap(array,l,randomIndex);
        int v = array[l];
        int j = l;
        for(int i = l+1;i <= r;i++){
            if(array[i] < v){
                swap(array,i,j+1);
                j++;
            }
        }
        swap(array,l,j);
        return j;
    }
    private static int partitionDouble(int[] array,int l,int r) {
        //int v = array[l];
        int randomIndex = (int) (Math.random()*(r-l+1) + l);
        swap(array,l,randomIndex);
        int v = array[l];
        int j = r;
        int i = l+1;
        while(true){
            while (i <= r && array[i] < v) i++;
            while (j >= l && array[j] > v) j--;
            if(i > j){
                break;
            }
            swap(array,i,j);
            i++;
            j--;
        }
        swap(array,l,j);
        return j;
    }
    private static int partitionT(int[] array,int l,int r) {
        //int v = array[l];
        int randomIndex = (int) (Math.random()*(r-l+1) + l);
        swap(array,l,randomIndex);
        int v = array[l];
        int i = l+1;
        int lt = l;
        int gt = r+1;
        while(i < gt){
            if(array[i] < v){
                swap(array,i,lt+1);
                i++;
                lt++;
            }else if(array[i] > v){
                swap(array,i,gt-1);
                gt--;
            }else {
                i++;
            }
        }
        swap(array,l,lt);
        return lt;
    }
    private static void swap(int[] array,int x,int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
