class DegreeOfAnArray {
    fun findShortestSubArray(nums: IntArray): Int {
        val count = mutableMapOf<Int, Int>()
        //first and last hashmaps to get index of first occurrence and last occurrence
        val first = mutableMapOf<Int, Int>()
        val last = mutableMapOf<Int, Int>()
        //pass through to get count of occurrences for each value
        for (i in nums.indices) {
            val n = nums[i]
            count[n] = count.getOrDefault(n, 0) + 1
            if (!first.containsKey(n)) {
                first[n] = i
            }
            last[n] = i
        }

        var degree = 0
        //gets degree of array
        for (c in count.values) {
            if (c > degree) {
                degree = c
            }
        }

        //largest possible length is the size of the array
        var minLength = nums.size
        //loop through each key in the count of occurrences array
        for (n in count.keys) {
            //if the count is equal to the degree, try to calculate the smallest length
            if (count[n] == degree) {
                val length = last[n]!! - first[n]!! + 1
                if (length < minLength) {
                    minLength = length
                }
            }
        }
        return minLength
    }
}