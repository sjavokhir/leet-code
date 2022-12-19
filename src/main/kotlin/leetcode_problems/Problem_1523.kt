package leetcode_problems

fun main() {
    println(countOdds(3, 7))
}

fun countOdds(low: Int, high: Int): Int {
    val add = if (low % 2 != 0 || high % 2 != 0) 1 else 0
    return (high - low) / 2 + add
}