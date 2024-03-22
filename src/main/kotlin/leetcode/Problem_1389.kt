package leetcode

import util.print

fun main() {
    "1389. Create Target Array in the Given Order" print {
        println(
            createTargetArray(
                nums = intArrayOf(0, 1, 2, 3, 4),
                index = intArrayOf(0, 1, 2, 2, 1)
            ).joinToString()
        )
        println(
            createTargetArray(
                nums = intArrayOf(1, 2, 3, 4, 0),
                index = intArrayOf(0, 1, 2, 3, 0)
            ).joinToString()
        )
        println(
            createTargetArray(
                nums = intArrayOf(1),
                index = intArrayOf(0)
            ).joinToString()
        )
    }
}

/*
Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
Example 3:

Input: nums = [1], index = [0]
Output: [1]
 */

fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    val lastIndex = nums.size - 1
    val ans = IntArray(nums.size)

    for (i in nums.indices) {
        for (j in lastIndex downTo index[i] + 1) {
            ans[j] = ans[j - 1]
        }

        ans[index[i]] = nums[i]
    }

    return ans
}