package leetcode_problems

fun main() {
    println(findNumbers(intArrayOf(12, 345, 2, 6, 7896)))
    println(findNumbers(intArrayOf(555, 901, 482, 1771)))
}

fun findNumbers(nums: IntArray): Int {
    var count = 0

    nums.forEach {
        if (it.toString().length % 2 == 0) count++
    }

    return count
}