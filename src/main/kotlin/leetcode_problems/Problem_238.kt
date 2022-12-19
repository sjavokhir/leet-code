package leetcode_problems

fun main() {
    println(productExceptSelf(nums = intArrayOf(1, 2, 3, 4)).toList())
}

fun productExceptSelf2(nums: IntArray): IntArray {
    val right = IntArray(nums.size) { 1 }
    val left = IntArray(nums.size) { 1 }

    for (index in 1 until nums.size) {
        left[index] = left[index - 1] * nums[index - 1]

        val rIdx = nums.size - index
        right[rIdx - 1] = right[rIdx] * nums[rIdx]
    }

    return left
        .mapIndexed { index, num -> num * right[index] }
        .toIntArray()
}

fun productExceptSelf(nums: IntArray): IntArray {
    val zeros = nums.count { it == 0 }

    val rst = IntArray(nums.size) { 0 }

    if (zeros > 1) {
        return rst
    }

    val product = nums.reduce { acc, i ->
        if (i != 0) {
            acc * i
        } else {
            acc
        }
    }

    nums.forEachIndexed { i, el ->
        if (el != 0) {
            rst[i] = product / el
        } else {
            rst[i] = product
        }
    }
    return rst
}