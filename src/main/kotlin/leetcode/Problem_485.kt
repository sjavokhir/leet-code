package leetcode

fun main() {
    println(findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)))
    println(findMaxConsecutiveOnes(intArrayOf(1, 0, 1, 1, 0, 1)))
    println(findMaxConsecutiveOnes(intArrayOf(0, 0, 0, 1, 0, 1)))
}

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var counter = 0
    var answer = 0

    nums.forEach {
        if (it == 1) {
            counter++
        } else {
            counter = 0
        }

        answer = Math.max(answer, counter)
    }

    return Math.max(answer, counter)
}
