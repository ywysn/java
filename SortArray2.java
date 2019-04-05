class Solution3 {
    public int[] sortArrayByParityII(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        int m = 0;
        int n = 1;
        for(int i = 0;i < A.length;i++){
            if(A[i]%2 == 0){
                B[m] = A[i];
                m+=2;
            }else {
                B[n] = A[i];
                n+=2;
            }
        }
        return B;
    }
}
public class SortArray2 {
    public static void main(String[] args) {
        int[] data = new int[]{4,2,5,7};
        Solution3 sol = new Solution3();
        sol.sortArrayByParityII(data);
    }
}
