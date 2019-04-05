import java.sql.SQLOutput;
import java.util.Arrays;
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (right > left){
            int mid = (right-left)+left;
            if(nums[mid] > target){
                 right= mid-1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else if(nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}
public class Binary{
    public static void main(String[] args) {
        int[] data = new int[]{-1,0,3,5,9};
        Solution sol = new Solution();
        sol.search(data,13);
        for(int i  :data){
            System.out.println(i);
        }
    }
}
