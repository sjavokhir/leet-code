package leetcode_problems

fun main() {
}

fun hammingWeight(n: Int): Int {
    return Integer.toBinaryString(n).count { it == '1' }
}