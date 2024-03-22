package leetcode

import util.print

fun main() {
    "1769. Minimum Number of Operations to Move All Balls to Each Box" print {
        println(minOperations("110").joinToString())
        println(minOperations("001011").joinToString())
    }
}

fun minOperations(boxes: String): IntArray {
    val n = boxes.length
    val ans = IntArray(n)
    var leftCount = 0
    var leftOps = 0

    for (i in 0 until n) {
        ans[i] += leftOps
        if (boxes[i] == '1') leftCount++
        leftOps += leftCount
    }

    var rightCount = 0
    var rightOps = 0

    for (i in n - 1 downTo 0) {
        ans[i] += rightOps
        if (boxes[i] == '1') rightCount++
        rightOps += rightCount
    }

    return ans
}