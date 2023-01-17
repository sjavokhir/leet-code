package leetcode_problems

fun main() {
    /*
    The pivot index is 3.
    Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
    Right sum = nums[4] + nums[5] = 5 + 6 = 11
    */
    println(pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)))

    // There is no index that satisfies the conditions in the problem statement.
    println(pivotIndex(intArrayOf(1, 2, 3)))

    /*
    The pivot index is 0.
    Left sum = 0 (no elements to the left of index 0)
    Right sum = nums[1] + nums[2] = 1 + -1 = 0
     */
    println(pivotIndex(intArrayOf(2, 1, -1)))

    /*
    The pivot index is 0.
    Right sum = 0 (no elements to the right of index 0)
    Left sum = nums[0] + nums[1] = 1 + -1 = 0
    */
    println(pivotIndex(intArrayOf(1, -1, 2)))
}

fun pivotIndex(nums: IntArray): Int {
    var leftSum = 0
    val leftSumNums = IntArray(nums.size)

    var rightSum = 0
    val rightSumNums = IntArray(nums.size)

    for (index in nums.indices) {
        leftSumNums[index] = leftSum
        leftSum += nums[index]

        rightSumNums[nums.lastIndex - index] = rightSum
        rightSum += nums[nums.lastIndex - index]
    }

    for (index in nums.indices) {
        if (leftSumNums[index] == rightSumNums[index]) return index
    }

    return -1
}