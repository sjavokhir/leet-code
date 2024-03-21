package leetcode

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