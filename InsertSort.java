public class InsertSort {
    public static void main(String[] args) {
        GenerateArray ger  = new GenerateArray();
        ArrayOutput out = new ArrayOutput();
        int []arr = ger.generateRandomArray(6,1,100);
        insertSort(arr);
        out.arrayOutput(arr);
    }
    public static void insertSort(int[] array){
        int n = array.length;
        //若数组元素只有一个或零个，直接返回
        if(n <= 1){
            return;
        }else{
            //控制循环的次数
            for (int i = 1;i < n;i++){
                //保存待排序元素的值
                int value  = array[i];
                //最后一个已排序区域元素的下标
                int j = i-1;
                //从后到前遍历查找
                for (;j >= 0;j--){
                    //若新元素的值小于该元素，该元素向后移一位
                    if(value < array[j]){
                        array[j+1] = array[j];
                    }else{
                        break;
                    }
                }
                //找到位置，插入新元素
                array[j+1] = value;
            }
        }
    }
}
