import java.util.*

class dailyTemps {
    fun dailyTemperaturesBrute(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size)
        for(i in temperatures.indices) {
            var foundHigherTemp = false
            for(j in 1..<temperatures.size) {
                if(temperatures[j] > temperatures[i] && j > i) {
                    result[i] = j-i
                    foundHigherTemp = true
                    println("higher temp: " + temperatures[j])
                    println("Lower temp: " + temperatures[i])
                    println("higher temp index: $j")
                    println("Lower temp index: $i")

                    println("result: " + result[i])

                    break
                }
            }
            if(!foundHigherTemp) {
                result[i] = 0
            }
        }
        return result
    }
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        if (temperatures.size == 1) return intArrayOf(0)
        val stack = Stack<Int>()
        val result = IntArray(temperatures.size)
        var poppedElement: Int
        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                poppedElement = stack.pop()
                result[poppedElement] = i - poppedElement
            }
            stack.push(i)
        }
        return result
    }
}
fun main() {
    val dailyTemps = dailyTemps()
    val array = intArrayOf(73,74,75,71,69,72,76,73)
    print(dailyTemps.dailyTemperatures(array))
}