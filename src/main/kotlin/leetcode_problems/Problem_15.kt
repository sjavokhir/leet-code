package leetcode_problems

import java.util.*

fun main() {
    println(threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
}

fun threeSum(nums: IntArray): List<List<Int>> {
    Arrays.sort(nums)

    val result: MutableSet<List<Int>> = HashSet()

    for (i in 0 until nums.size - 1) {
        val one = nums[i]

        for (j in i until nums.size) {
            if (i == j) continue

            val two = nums[j]
            val three = 0 - one - two
            val idxThree = Arrays.binarySearch(nums, three)

            if (idxThree >= 0 && idxThree != i && idxThree != j) {
                val list: MutableList<Int> = ArrayList()
                if (three <= one) {
                    list.add(three)
                    list.add(one)
                    list.add(two)
                } else if (three <= two) {
                    list.add(one)
                    list.add(three)
                    list.add(two)
                } else {
                    list.add(one)
                    list.add(two)
                    list.add(three)
                }
                result.add(list)
            }
        }
    }

    return result.toList()
}