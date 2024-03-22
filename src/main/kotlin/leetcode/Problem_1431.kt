package leetcode

import util.print

fun main() {
    "1431. Kids With the Greatest Number of Candies" print {
        println(kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3))
        println(kidsWithCandies(intArrayOf(4, 2, 1, 1, 2), 1))
        println(kidsWithCandies(intArrayOf(12, 1, 12), 10))
    }
}

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val max = candies.max()

    return candies.map { candy ->
        candy + extraCandies >= max
    }
}