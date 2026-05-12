class duplicateFinder {
    fun findDuplicateInefficient(nums: IntArray): Int {
        //inefficient solution O(n^2) time complexity O(1) space complexity
        for (i in nums.indices) {
            for (j in i+1..<nums.size){
                if(nums[i] == nums[j]){
                    return nums[i]
                }
            }
        }
        return 0;
    }
    fun findDuplicateMoreEfficient(nums: IntArray): Int {
        //more efficient solution O(nlogn) time complexity, O(1) space complexity
        nums.sort()
        for(i in nums.indices) {
            if(nums[i] == nums[i+1]) {
                return nums[i]
            }
        }
        return -1;
    }
    //most efficient
    fun findDuplicate(nums: IntArray): Int {
        //most efficient solution O(n) time complexity, O(1) space complexity
        var slow = 0
        var fast = 0

        while(true) {
            slow = nums[slow]
            fast = nums[nums[fast]]
            if (fast == slow) break
        }

        var slow2 = 0
        while(slow != slow2) {
            slow = nums[slow]
            slow2 = nums[slow2]
        }
        return slow

    }
}
fun main() {
    val duplicateFinder = duplicateFinder()
    println(duplicateFinder.findDuplicate(intArrayOf(1,3,4,2,2)))
}