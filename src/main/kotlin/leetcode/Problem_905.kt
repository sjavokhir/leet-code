package leetcode

fun main() {
    println(sortArrayByParity(intArrayOf(3, 1, 2, 4)).toList())
    println(sortArrayByParity(intArrayOf(0)).toList())
}

fun sortArrayByParity(nums: IntArray): IntArray {
    var length = 0

    for (i in nums.indices) {
        if (nums[i] % 2 == 0) {
            nums.swap(length++, i)
        }
    }

    return nums
}

private fun IntArray.swap(first: Int, second: Int) {
    val temp = get(first)
    set(first, get(second))
    set(second, temp)
}