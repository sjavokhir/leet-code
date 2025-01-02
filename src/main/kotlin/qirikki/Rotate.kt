package qirikki

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)

    println(rotate(nums, 3).toList())
}

private fun rotate(nums: IntArray, k: Int): IntArray {
    val step = k % nums.size
    reverse(nums, 0, nums.lastIndex)
    reverse(nums, 0, step - 1)
    reverse(nums, step, nums.lastIndex)

    return nums
}

private fun reverse(nums: IntArray, start: Int, end: Int) {
    var left = start
    var right = end

    while (left < right) {
        val temp = nums[left]
        nums[left] = nums[right]
        nums[right] = temp
        left++
        right--
    }
}