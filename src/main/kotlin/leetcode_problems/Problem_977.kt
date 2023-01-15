package leetcode_problems

import java.util.Arrays
import kotlin.math.pow

fun main() {
    println(sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).toList())
    println(sortedSquares(intArrayOf(-7, -3, 2, 3, 11)).toList())
}

fun sortedSquares(nums: IntArray): IntArray {
    for (i in nums.indices) {
        if (nums[i] < 0) {
            nums[i] = Math.abs(nums[i])
        }
    }

    Arrays.sort(nums)

    for (i in nums.indices) {
        nums[i] = nums[i] * nums[i]
    }

    return nums
}

// Native aproach
fun sortedSquare2(nums: IntArray) = nums.map { it * it }.sorted().toIntArray()

// Two pointers aproach
fun sortedSquares3(nums: IntArray): IntArray {
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