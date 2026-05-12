import java.util.Stack

class ReversePolishNotation {
    fun evalRPN(tokens: Array<String>): Int {
        val RPNStack = Stack<Int>()
        for (s in tokens) {
            when (s) {
                "+" -> {
                    val firstValue = RPNStack.pop()
                    val secondValue = RPNStack.pop()
                    RPNStack.push((firstValue + secondValue))
                }
                "-" -> {
                    val firstValue = RPNStack.pop()
                    val secondValue = RPNStack.pop()
                    RPNStack.push((secondValue - firstValue))
                }
                "/" -> {
                    val firstValue = RPNStack.pop()
                    val secondValue = RPNStack.pop()
                    RPNStack.push((secondValue / firstValue))
                }
                "*" -> {
                    val firstValue = RPNStack.pop()
                    val secondValue = RPNStack.pop()
                    RPNStack.push((firstValue * secondValue))

                }
                else -> {
                    RPNStack.push(s.toInt())
                }
            }
        }
        return RPNStack.pop()
    }
}