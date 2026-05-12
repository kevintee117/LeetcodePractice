import kotlin.math.max
import kotlin.math.min

class containerMostWater {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var startPointerIndex = 0
        var endPointerIndex = height.size-1
        while (startPointerIndex < endPointerIndex) {
            var minHeight =(min(height[startPointerIndex], height[endPointerIndex]))
            var currArea =
                (endPointerIndex - startPointerIndex) * minHeight
            maxArea = max(currArea,maxArea)
            if(height[startPointerIndex] < height[endPointerIndex]) {
                startPointerIndex ++
            } else {
                endPointerIndex--
            }
        }
        return maxArea


    }
}