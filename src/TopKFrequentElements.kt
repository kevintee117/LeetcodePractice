class TopKFrequentElements {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        //put frequency of numbers in a map
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        //turn map into list then sort map by descending order
        val smap = map.toList().sortedByDescending { it.second }
        //return the kth smallest elements in int array form
        return smap.subList(0, k).map {
            it.first
        }.toIntArray()


    }
}