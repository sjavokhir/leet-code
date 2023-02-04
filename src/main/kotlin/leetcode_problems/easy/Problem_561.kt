package leetcode_problems.easy

import utils.print

/*
    Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn)
    such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

    Input: nums = [1,4,3,2]
    Output: 4
    Explanation: All possible pairings (ignoring the ordering of elements) are:
    1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
    2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
    3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
    So the maximum possible sum is 4.

    Input: nums = [6,2,6,5,1,2]
    Output: 9
    Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.

    Solution: This solution first sorts the input array nums in ascending order, and then adds up the smallest
    elements of each pair by iterating through the array with a step of 2. The result is the sum of all the
    smallest elements, which is the maximum possible sum according to the problem statement.
 */

fun main() {
    "561. Array Partition solution" print {
        println(solution(intArrayOf(1, 4, 3, 2)))
        println(solution(intArrayOf(6, 2, 6, 5, 1, 2)))
    }
}

private fun solution(nums: IntArray): Int {
    nums.sort()
    var sum = 0
    for (i in nums.indices step 2) {
        sum += nums[i]
    }
    return sum
}