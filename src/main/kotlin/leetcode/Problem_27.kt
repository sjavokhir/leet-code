package leetcode

import util.print

fun main() {
    "27. Remove Element solution 1" print {
        println(solution1(intArrayOf(3, 2, 2, 3), 3))
        println(solution1(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
    }

    "27. Remove Element solution 2" print {
        println(solution2(intArrayOf(3, 2, 2, 3), 3))
        println(solution2(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
    }
}

private fun solution1(nums: IntArray, num: Int): Int {
    var length = 0
    nums.forEach { if (it != num) nums[length++] = it }
    return length
}

private fun solution2(nums: IntArray, value: Int): Int {
    if (nums.isEmpty()) return value

    var left = 0
    var right = nums.lastIndex

    while (left < right) {
        if (nums[left] == value && nums[right] == value) {
            right--
        } else if (nums[left] == value && nums[right] != value) {
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            right--
            left++
        } else if (nums[left] != value && nums[right] == value) {
            right--
        } else {
            left++
        }
    }

    var counter = 0

    nums.forEach {
        if (it != value) {
            counter++
        } else return counter
    }

    return counter
}