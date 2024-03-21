package leetcode

import util.print

fun main() {
    "169. Majority Element solution" print {
        println(solution(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    }
}

private fun solution(nums: IntArray): Int {
    var count = 0
    var candidate: Int? = null

    for (num in nums) {
        if (count == 0) {
            candidate = num
        }
        count += if (num == candidate) 1 else -1
    }

    return candidate ?: -1
}