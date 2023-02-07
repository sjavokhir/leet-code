package leetcode_problems.easy

import utils.print

fun main() {
    "136. Single Number solution" print {
        println(solution(intArrayOf(4, 1, 2, 1, 2)))
        println(solution(intArrayOf(1)))
        println(solution(intArrayOf(2, 2, 1)))
    }
}

private fun solution(nums: IntArray): Int {
    var answer = 0
    nums.forEach {
        answer = answer xor it
    }
    return answer
}