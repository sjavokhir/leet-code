package leetcode

import util.print

fun main() {
    "1480. Running Sum of 1d Array" print {
        println(runningSum(intArrayOf(1, 2, 3, 4)).joinToString())
        println(runningSum(intArrayOf(1, 1, 1, 1, 1)).joinToString())
        println(runningSum(intArrayOf(3, 1, 2, 10, 1)).joinToString())
    }
}

fun runningSum(nums: IntArray): IntArray {
    val ans = IntArray(nums.size)
    ans[0] = nums[0]

    for (i in 1..<nums.size) {
        ans[i] = ans[i - 1] + nums[i]
    }

    return ans
}
