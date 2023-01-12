package leetcode_problems

import kotlin.math.pow

fun main() {
    println(sortedSquares2(intArrayOf(-4, -1, 0, 3, 10)).toList())
    println(sortedSquares2(intArrayOf(-7, -3, 2, 3, 11)).toList())
}

// Native aproach
fun sortedSquares(nums: IntArray) = nums.map { it * it }.sorted().toIntArray()

// Two pointers aproach
fun sortedSquares2(nums: IntArray): IntArray {
    val result = IntArray(nums.size)

    var left = 0
    var right = nums.lastIndex

    for (i in nums.lastIndex downTo 0) {
        var largerNum: Int

        if (Math.abs(nums[left]) > Math.abs(nums[right])) {
            largerNum = nums[left]
            left++
        } else {
            largerNum = nums[right]
            right--
        }

        result[i] = largerNum * largerNum
    }

    return result
}