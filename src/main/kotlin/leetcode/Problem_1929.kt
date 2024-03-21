package leetcode

import util.print

fun main() {
    "1929. Concatenation of Array" print {
        println(getConcatenation(intArrayOf(1, 2, 1)).joinToString())
        println(getConcatenation(intArrayOf(1, 3, 2, 1)).joinToString())
    }
}

fun getConcatenation(nums: IntArray): IntArray {
    val size = nums.size
    val ans = IntArray(size * 2)

    nums.forEachIndexed { index, item ->
        ans[index] = item
        ans[index + size] = item
    }

    return ans
}