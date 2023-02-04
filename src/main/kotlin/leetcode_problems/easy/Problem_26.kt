package leetcode_problems.easy

import utils.print

fun main() {
    "26. Remove Duplicates from Sorted Array solution" print {
        println(solution(intArrayOf(1, 1, 2)))
        println(solution(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
    }
}

private fun solution(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var slow = 0 // to track the position of unique elements
    var fast = 1 // to scan array

    while (fast < nums.size) {
        if (nums[fast] != nums[slow]) {
            slow += 1
            nums[slow] = nums[fast]
        }
        fast += 1
    }
    return slow + 1
}