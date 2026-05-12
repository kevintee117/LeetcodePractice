import java.util.*

class StoneWeight {
    fun lastStoneWeight(stones: IntArray): Int {
        val stonesList = stones.toMutableList()
        if (stones.size == 1) {
            return stones[0]
        }
        while (stonesList.size > 1) {
            stonesList.sort()
            var stoneX = stonesList[stonesList.size - 2]
            var stoneY = stonesList[stonesList.size - 1]
            if( stoneX ==  stoneY) {
                stonesList.remove(stoneX)
                stonesList.remove(stoneY)
            } else {
                stonesList.remove(stoneX)
                stonesList[stonesList.size - 1] = stoneY - stoneX
            }
        }
        if(stonesList.isEmpty()) {
            return 0
        }
        return stonesList[0]
    }
    fun lastStoneWeightEfficient(stones: IntArray): Int {
        val stonesQueue = PriorityQueue<Int> { a, b -> b.compareTo(a) }
        stones.forEach { stonesQueue.add(it) }

        while (stonesQueue.size > 1) {
            stonesQueue.add(stonesQueue.poll() - stonesQueue.poll())
        }

        return stonesQueue.poll()
    }

    }
fun main() {
    val stoneWeight = StoneWeight()
    val stone1 = intArrayOf(2,7,4,1,8,1)
    print(stoneWeight.lastStoneWeight(stone1))
}