class containsDuplicate {


    //O(n^2) because of the nested for loop
    //do two loops to check one number against the rest to see if there is a repeat
    fun hasDuplicateBrute(nums: IntArray): Boolean {
        for(i in 0 until nums.size -1) {
            for (j in i +1 until nums.size) {
                if (nums[i] == nums[j]) {
                    return true
                }
            }
        }
        return false
    }

    //medium efficiency
    //O(nlogn) because of the sorting
    //sort nums list
    // if the list is sorted a duplicate will be right next to the following index
    //return true if there is a duplicate in the one next to it
    //return false if there is not a duplicate in the one next to it
    fun hasDuplicate(nums: IntArray): Boolean {
        nums.sort()
        for (i in 0 until nums.size -1) {
            if(nums[i] == nums[i+1]) {
                return true
            }
        }
        return false
    }

    //O(N) complexity
    //add every value to a set and if it already exists within the set, return true
    // else return false
    fun hasDuplicateEfficient(nums: IntArray): Boolean {
        val mutableSet = hashSetOf<Int>()
        for(num in nums) {
            val isValid = mutableSet.add(num)
            if (!isValid) {
                return true
            }
        }
        return false
    }

    fun hasDuplicateEfficientTwo(nums: IntArray): Boolean {
        val set = nums.toSet()
        return set.size != nums.size
    }

}