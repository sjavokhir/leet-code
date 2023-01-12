package leetcode_problems

fun main() {
    singleNumber(intArrayOf(4, 1, 2, 1, 2))
    singleNumber(intArrayOf(1))
    singleNumber(intArrayOf(2, 2, 1))
}

fun singleNumber(nums: IntArray): Int {
    var answer = 0
    nums.forEach {
        answer = answer xor it
    }
    return answer
}