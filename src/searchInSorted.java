public class searchInSorted {
    public int search(int[] nums, int target) {
        //break in half and perform binary search until you reach the needed index
        int start = 0;
        int end = nums.length -1;

        while (start <= end) {
            int midpoint = (start+end)/2;
            //if the midpoint happens to be the needed target, return
            if(nums[midpoint] == target){
                return midpoint;
            }
            //if the number at the starting index is less than or equal to
            // the value at the midpoint, then you can make a judgement on if
            //that half is ordered or not
            if(nums[start] <= nums[midpoint]) {
                /*
                If the target is less than the value at the midpoint
                but greater than or equal to the value at the start,
                the target is somewhere in there so move the end index less than 1
                 */
                if (target < nums[midpoint] && target >= nums[start]) {
                    end = midpoint - 1;
                }
                /*
                else move up the start index up 1
                 */
                else {
                    start = midpoint + 1;
                }
            }
            //if the number at the ending index is less than or equal to
            // the value at the midpoint, then you can make a judgement on if
            //that half is ordered or not
            if(nums[end] >= nums[midpoint]) {
                 /*
                If the target is greater than the value at the midpoint
                but greater than or equal to the value at the end,
                the target is somewhere in there so move the start index up 1
                 */
                if (target > nums[midpoint] && target <= nums[end]) {
                    start = midpoint + 1;
                }
                /*
                else move the start index down 1
                 */
                else {
                    end = midpoint - 1;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        searchInSorted s = new searchInSorted();
        int[] nums = {4,5,6,7,0,1,2};
        System.out.print(s.search(nums, 4));
        int[] nums2 = {6,7,1,2,3,4,5};
        System.out.print(s.search(nums2, 7));
    }
}
