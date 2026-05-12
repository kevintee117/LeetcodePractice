import java.util.HashSet

class MathTriplets {
    fun arithmeticTriplets(nums: IntArray, diff: Int): Int {
        var count = 0
        val seen = HashSet<Int>()
        for(num in nums) {
            if(seen.contains(num - diff ) && seen.contains(num-diff*2)) {
                count++
            }
            seen.add(num)
        }
        return count
    }
}