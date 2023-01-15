package leetcode_problems

import java.util.*

fun main() {
    println(thirdMax(intArrayOf(3, 2, 1)))
    println(thirdMax(intArrayOf(1, 2)))
    println(thirdMax(intArrayOf(2, 2, 3, 1)))
    println(thirdMax(intArrayOf(1, 1, 2)))
    println(thirdMax(intArrayOf(1, 1, 1)))
}

fun thirdMax(nums: IntArray): Int {
    var fMax = Long.MIN_VALUE // First Max
    var sMax = Long.MIN_VALUE // Second Max
    var tMax = Long.MIN_VALUE // Third Max

    for (num in nums) {
        if (num > fMax) {
            tMax = sMax
            sMax = fMax
            fMax = num.toLong()
        } else if (num > sMax && num.toLong() != fMax) {
            tMax = sMax
            sMax = num.toLong()
        } else if (num > tMax && num.toLong() != sMax && num.toLong() != fMax) {
            tMax = num.toLong()
        }
    }

    // If Third Max was not updated, return the First Max
    return if (tMax == Long.MIN_VALUE) fMax.toInt() else tMax.toInt()
}

fun thirdMax2(nums: IntArray): Int {
    Arrays.sort(nums)
    val lastIndex = removeDuplicates(nums)

    return when {
        lastIndex == 1 || nums.size == 1 -> nums.first()
        lastIndex == 2 || nums.size == 2 -> nums[1]
        lastIndex == nums.size -> nums[nums.lastIndex - 2]
        else -> nums[lastIndex - 3]
    }
}