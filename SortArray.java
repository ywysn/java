class Solution1 {
    public int[] sortArrayByParity(int[] A) {
        //原数组长度
        int len = A.length;
        //创建新的数组
        int[] B = new int[len];
        int j = 0;
        //遍历原数组元素
        for(int i = 0;i < A.length;i++){
            //判断奇偶性
            if(A[i]%2 == 0){
                B[j] = A[i];
                j++;
            }else if(A[i]%2 == 1) {
                B[len-1] = A[i];
                len--;
            }
        }
    return B;
    }
}
public class SortArray {
    public static void main(String[] args) {
        int[] data =new int[]{3,1,2,4};
        Solution1 sol = new Solution1();
        sol.sortArrayByParity(data);
    }
}
