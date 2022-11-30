package math// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range

fun main() {
    println(countOdds(3, 7))
}

fun countOdds(low: Int, high: Int): Int {
    val add = if (low % 2 != 0 || high % 2 != 0) 1 else 0
    return (high - low) / 2 + add
}