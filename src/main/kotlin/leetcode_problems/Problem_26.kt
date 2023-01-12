package leetcode_problems

fun main() {
    println(removeDuplicates(intArrayOf(1, 1, 2)))
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
}

// 1, 1, 2    i = 1, lastIndex = 2, counter = 1
// 1, 1, 2    i = 0, lastIndex = 1, counter = 2

fun removeDuplicates(nums: IntArray): Int {
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