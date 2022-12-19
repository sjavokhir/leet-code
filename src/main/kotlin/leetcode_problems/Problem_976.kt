package leetcode_problems

fun main() {
    println(largestPerimeter(intArrayOf(3, 2, 3, 4)))
}

fun largestPerimeter(nums: IntArray): Int {
    if (nums.size == 3) {
        val a = nums[0]
        val b = nums[1]
        val c = nums[2]

        return if (isValidTriangle(a, b, c)) a + b + c else 0
    }

    nums.sort()

    for (i in nums.lastIndex downTo 0) {
        if (i < 2) {
            return 0
        } else {
            val a = nums[i]
            val b = nums[i - 1]
            val c = nums[i - 2]

            if (isValidTriangle(a, b, c)) return a + b + c
        }
    }

    return 0
}

private fun isValidTriangle(a: Int, b: Int, c: Int): Boolean {
    return (a + b > c) && (a + c > b) && (b + c > a)
}