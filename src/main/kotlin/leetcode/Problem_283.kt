package leetcode

fun main() {
    moveZeroes(intArrayOf(0, 1, 0, 3, 12))
    moveZeroes(intArrayOf(1, 2, 3, 1, 12))
    moveZeroes(intArrayOf(0))
}

fun moveZeroes(nums: IntArray) {
    var length = 0

    for (i in nums.indices) {
        if (nums[i] != 0) {
            nums.swap(length++, i)
        }
    }
}

private fun IntArray.swap(first: Int, second: Int) {
    val temp = get(first)
    set(first, get(second))
    set(second, temp)
}