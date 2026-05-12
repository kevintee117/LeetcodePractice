class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var leftPointer = 0
        var rightPointer = nums.size -1
        while (leftPointer <= rightPointer) {
           var midPoint = (leftPointer + rightPointer) /2
            if(nums[midPoint] > target) {
                rightPointer--
            }
            else if(nums[midPoint] < target) {
                leftPointer++
            }
            else {
                return midPoint
            }
        }
        return -1

    }
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (arr in matrix) {
            var lookForTarget = search(arr, target)
            if(lookForTarget != -1) {
                return true
            }
        }
        return false
    }
}
fun main() {
    val BinarySearch = BinarySearch()
    val testArray = intArrayOf(-1,0,3,5,9,12)
    val testArray2 = intArrayOf(-1,0,3,5,9,12)

//    println("result: "+ Integer.valueOf( BinarySearch.search(testArray,9)))
    println("result: "+ Integer.valueOf( BinarySearch.search(testArray2,2)))

}