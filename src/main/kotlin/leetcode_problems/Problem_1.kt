package leetcode_problems

import utils.print
import java.util.*

fun main() {
    "1. Two Sum solution" print {
        println(solution1(intArrayOf(2, 7, 11, 15), 9).toList())
        println(solution1(intArrayOf(3, 2, 4), 6).toList())
        println(solution1(intArrayOf(3, 3), 6).toList())
    }
}

private fun solution1(nums: IntArray, target: Int): IntArray {
    val complements = HashMap<Int, Int>()
    nums.forEachIndexed { index, num ->
        val requiredNum = target - num
        if (complements.containsKey(requiredNum)) {
            return intArrayOf(complements[requiredNum]!!, index)
        }
        complements[num] = index
    }
    return intArrayOf()
}