import java.util.*

class productSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val answer: IntArray = IntArray(nums.size)
        answer[0] = 1
        //make two passes
        //first pass is starting at the first index and multiplying the previous element in the answer
        //array and the element previous in the given array
        for(i in 1 until nums.size){
            answer[i] = answer[i-1] * nums[i-1]
            println("answer[$i] = answer[i-1](" +  answer[i-1] + ") * nums[i-1] (" + nums[i-1]+")")
        }
        println(answer.contentToString())

        //second pass
        var right = 1
        for (i in nums.size -1 downTo 0){
            answer[i] *= right
            right *= nums[i]
            println("answer[i]: "+ answer[i])
            println("right: $right")
        }
        return answer
    }
}

fun main() {
    val ps = productSelf()
    println(ps.productExceptSelf(intArrayOf(1, 2, 3, 4)).contentToString())
    println(ps.productExceptSelf(intArrayOf(-1,1,0,-3,3)).contentToString())

}