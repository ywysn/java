
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j = 0;j < n;j++) {
            nums1[m + j] = nums2[j];
            sort(nums1, m + j);
        }

    }
    public int[] sort(int[] nums1,int p){
        for(int k = p;k > 0;k--){
            if(nums1[k] < nums1[k-1]){
                int temp = nums1[k];
                nums1[k] = nums1[k-1];
                nums1[k-1] = temp;
            }else {
                break;
            }
        }
        return nums1;
    }
}
public class MyTest {
    public static void main(String[] args) {
        int []nums1 = {1,4,3,0,0,0};
        int []nums2 = {2,5,6};
        Solution sol = new Solution();
        sol.merge(nums1,3,nums2,3);
    }

}