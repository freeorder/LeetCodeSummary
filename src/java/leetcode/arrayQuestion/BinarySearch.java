package java.leetcode.arrayQuestion;

/**
 * @Author: HQC
 * @Contact: qq
 * @Data: 2021/11/23 10:54
 *
 **/

public class BinarySearch {

    int search(int[] nums, int target) {

        int left = 0, right = nums.length-1;
        int middle = 0;

        while(left<=right){//这里是<=
            middle = left + ((right - left)/2);
            if(nums[middle] == target){
                return middle ;
            }else if(nums[middle]>target){
                right = middle - 1;
            }else if(nums[middle]<target){
                left = middle + 1;
            }
        }
        return -1;
    }
}
