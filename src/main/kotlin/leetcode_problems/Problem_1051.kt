package leetcode_problems

fun main() {
    println(heightChecker(intArrayOf(1, 1, 4, 2, 1, 3)))
    println(heightChecker(intArrayOf(5, 1, 2, 3, 4)))
    println(heightChecker(intArrayOf(1, 2, 3, 4, 5)))
}

fun heightChecker(heights: IntArray): Int {
    val newHeights = heights.sortedArray()
    var counter = 0

    for (i in heights.indices) {
        if (heights[i] != newHeights[i]) {
            counter++
        }
    }

    return counter
}