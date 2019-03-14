package www.bit.java;
public class Sort{
    public static void main(String[] args) {
        //int[] data = SortHelpe.generateArray(10000,10000,100000);
        //bubbleSort(data);
        //insertSort(data);
        //SortHelpe.printArray(data);
        int[] data = new int[]{1,5,7,9,6,4,3,2};
        quickSort(data);
        SortHelpe.printArray(data);
    }
    public static void bubbleSort(int[] array) {
        long statr = System.currentTimeMillis();
        int n = array.length;
        if (n <= 1) {
            return;
        } else {
            for (int i = 0; i < n; i++) {
                boolean flag = false;
                for (int j = 0; j < n - 1 - i; j++){
                    if(array[j] > array[j+1]){
                        flag = true;
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
                if(!flag){
                    System.out.println("数据集已经有序");
                    break;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("冒泡算法总耗时为："+(end-statr));
    }
    public static void insertSort(int[] array){
        int n = array.length;
        if(n <= 1){
            return;
        }else{
            for(int i = 1;i < n;i++){
                int value = array[i];
                int j = i-1;
                //找到要插入的位置
                for(;j >= 0;j--){
                    if(array[j] > value){
                        array[j+1] = array[j];
                    }else{
                        break;
                    }
                }
                //找到要插入的位置
                array[j+1] = value;
            }
        }
    }
    public static void quickSort(int[] array){
        int n = array.length;
        if(n <= 1){
            return;
        }
        quickSortInternal(array,0,n-1);
    }
    private static void quickSortInternal(int []array,int l,int r){
        if(l >= r){
            return;
        }
        int q = partition(array,l,r);
        quickSortInternal(array,l,q-1);
        quickSortInternal(array,q+1,r);
    }
    private static int partition(int[] array,int l ,int r){
        int v = array[l];
        //array[l+1.....j]<v
        int j = l;
        //array[j+1........i-1]>v
        int i = l+1;
        for(;i <= r;i++){
            if(array[i] < v){
                //交换i与j+1元素
                sawp(array,j+1,i);
                j++;
            }
        }
        sawp(array,l,j);
        return j;
    }
    private static int pratition2(int[] array,int l, int r){
        int randomIndex = (int) ((Math.random()*(r-l+1))+l);
        sawp(array,l,randomIndex);
        int v = array[l];
        int i = l+1;
        int j = r;
        while(true){
            while (i <= r&&array[i]<v)i++;
            while (i >= l+1&&array[i]>v)i++;
                if(i>j){
                    
                }
        }
    }
    private static void sawp(int[] array,int indexA,int indexB){
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
