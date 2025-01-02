package qirikki

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)

    println(moveZeroes(nums).toList())
}

private fun moveZeroes(nums: IntArray): IntArray {
    var zeroes = 0

    for (i in nums.indices) {
        if (nums[i] == 0) {
            zeroes++
            continue
        }

        val temp = nums[i - zeroes]
        nums[i - zeroes] = nums[i]
        nums[i] = temp
    }

    return nums
}