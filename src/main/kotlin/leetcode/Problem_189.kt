package leetcode

import util.print

/*
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]

    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation:
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]

    Solution: The solution uses a combination of three reverse operations to rotate the array.
    Firstly, we calculate k as the number of steps to rotate the array by modulo the length of the array.
    This is because if k is greater than the length of the array,
    it would be equivalent to rotating the array by k % nums.size steps.

    Next, we reverse the entire array nums, then reverse the subarray nums[0..k-1], and finally
    reverse the subarray nums[k..nums.size-1]. These three reverse operations result in the original
    array being rotated to the right by k steps.

    *****

    The solution I provided has a time complexity of O(n) and a space complexity of O(1),
    which is optimal for this problem. The solution uses a combination of three reverse operations
    to achieve the desired rotation, and this technique is widely used and considered to be an
    efficient solution to this problem.

    It is unlikely that this solution can be improved in terms of time or space complexity.
 */

fun main() {
    "189. Rotate Array solution 1" print {
        solution1(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3)
        solution1(intArrayOf(-1, -100, 3, 99), 2)
    }

    "189. Rotate Array solution 2" print {
        solution2(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3)
        solution2(intArrayOf(-1, -100, 3, 99), 2)
    }
}

private fun solution1(nums: IntArray, k: Int) {
    val step = k % nums.size
    reverse(nums, 0, nums.lastIndex)
    reverse(nums, 0, step - 1)
    reverse(nums, step, nums.lastIndex)

    println(nums.toList())
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

private fun solution2(nums: IntArray, k: Int) {
    val step = k % nums.size
    var count = 0
    var start = 0
    while (count < nums.size) {
        var current = start
        var prev = nums[start]
        do {
            val nextIndex = (current + step) % nums.size
            val tmp = nums[nextIndex]
            nums[nextIndex] = prev
            prev = tmp
            current = nextIndex
            count++
        } while (start != current)
        start++
    }

    println(nums.toList())
}