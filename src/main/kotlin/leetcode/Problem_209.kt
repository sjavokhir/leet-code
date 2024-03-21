package leetcode

import util.print

/*
    Given an array of positive integers nums and a positive integer target, return the minimal length of a
    subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

    A subarray is a contiguous non-empty sequence of elements within an array.

    Input: target = 7, nums = [2,3,1,2,4,3]
    Output: 2
    Explanation: The subarray [4,3] has the minimal length under the problem constraint.

    Input: target = 4, nums = [1,4,4]
    Output: 1

    Input: target = 11, nums = [1,1,1,1,1,1,1,1]
    Output: 0

    Solution: In this solution, we use two pointers start and end to keep track of the subarray,
    and a variable sum to keep track of the sum of the elements between the two pointers.
    The variable minLen is used to store the minimum length of the subarray whose sum is greater than
    or equal to the target.

    The outer loop moves the pointer end to the right until the sum of the elements between the
    two pointers is greater than or equal to the target. The inner loop moves the pointer start to the right
    and updates the sum and minLen until the sum of the elements between the two pointers is less than the target.
    Finally, we return minLen if it has been updated, or 0 otherwise.

    *****

    The solution I provided is optimal in terms of time complexity, as it has a time complexity of O(n).
    This is because the two-pointer technique only requires one pass through the input array.

    In terms of space complexity, the solution uses a constant amount of additional space,
    so it is also optimal in this aspect.

    It is unlikely that this solution can be improved in terms of time or space complexity.
 */

fun main() {
    "209. Minimum Size Subarray Sum solution" print {
        println(solution(7, intArrayOf(2, 3, 1, 2, 4, 3)))
        println(solution(4, intArrayOf(1, 4, 4)))
        println(solution(11, intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)))
    }
}

private fun solution(target: Int, nums: IntArray): Int {
    var left = 0
    var right = 0
    var sum = 0
    var ans = Int.MAX_VALUE
    while (right < nums.size) {
        sum += nums[right]
        right++
        while (sum >= target) {
            ans = minOf(ans, right - left)
            sum -= nums[left]
            left++
        }
    }
    return if (ans != Int.MAX_VALUE) ans else 0
}