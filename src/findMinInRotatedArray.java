import java.util.Arrays;

public class findMinInRotatedArray {
    public int findMin(int[] nums) {
        //use binary search to find min value
        int left = 0;
        int right = nums.length-1;
        while(left < right) {
            int midpoint = (left+right)/2;
            //if number at the midpoint is less than the number at the end
            //change the end number so its at the midpoint
            if(nums[midpoint] < nums[right]) {
                right = midpoint;
            }
            //if the number at the midpoint is greater than the number at the end,
            //move the leftbound to the midpoint +1
            else {
                left = midpoint+1;
            }
        }
        //the number at the leftbound will eventually leave u with the lowest number
        return nums[left];
    }

    public static void main(String[] args) {
        findMinInRotatedArray fm = new findMinInRotatedArray();
        System.out.println(fm.findMin(new int[]{3,4,5,1,2}));
    }
}
