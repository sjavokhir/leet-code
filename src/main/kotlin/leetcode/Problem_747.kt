package leetcode

fun main() {
    println(dominantIndex(intArrayOf(3, 6, 1, 0)))
    println(dominantIndex(intArrayOf(1, 2, 3, 4)))
    println(dominantIndex(intArrayOf(5, 1, 2, 3, 4)))
}

fun dominantIndex(nums: IntArray): Int {
    var maxIndex = 0

    for (index in 1..nums.lastIndex) {
        if (nums[index] > nums[maxIndex]) {
            maxIndex = index
        }
    }

    for (index in nums.indices) {
        if (maxIndex != index && nums[maxIndex] < 2 * nums[index]) return -1
    }

    return maxIndex
}