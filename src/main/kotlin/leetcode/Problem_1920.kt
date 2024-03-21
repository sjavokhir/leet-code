package leetcode

import util.print

fun main() {
    "1920. Build Array from Permutation" print {
        println(buildArray(intArrayOf(0, 2, 1, 5, 3, 4)).joinToString())
        println(buildArray(intArrayOf(5, 0, 1, 2, 3, 4)).joinToString())
    }
}

fun buildArray(nums: IntArray): IntArray {
    val ans = IntArray(nums.size)

    for (i in nums.indices) {
        ans[i] = nums[nums[i]]
    }

    return ans
}