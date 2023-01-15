package leetcode_problems

fun main() {
    println(removeElement(intArrayOf(3, 2, 2, 3), 3))
    println(removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
}

fun removeElement(nums: IntArray, num: Int): Int {
    var length = 0
    nums.forEach { if (it != num) nums[length++] = it }
    return length
}

fun removeElement2(nums: IntArray, value: Int): Int {
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