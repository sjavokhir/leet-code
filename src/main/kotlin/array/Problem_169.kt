package array// https://leetcode.com/problems/majority-element/

fun main() {
    println(majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
}

fun majorityElement(nums: IntArray): Int {
    var count = 0
    var candidate: Int? = null

    for (num in nums) {
        if (count == 0) {
            candidate = num
        }
        count += if (num == candidate) 1 else -1
    }

    return candidate ?: -1
}