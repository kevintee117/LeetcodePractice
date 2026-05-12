class TwoSumTwo {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var startPointerIndex  = 0
        var endPointerIndex = numbers.size - 1
        while(startPointerIndex < endPointerIndex) {
            val currSum = numbers[startPointerIndex] + numbers[endPointerIndex]
            if (currSum > target) {
                endPointerIndex--
            }
            else if (currSum < target) {
                startPointerIndex++
            } else {
                return intArrayOf(startPointerIndex +1, endPointerIndex +1)
            }

        }
        return intArrayOf()
    }
}
fun main() {
    val sumTwo = TwoSumTwo()
    println(sumTwo.twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
}