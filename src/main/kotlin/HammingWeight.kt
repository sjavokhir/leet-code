// https://leetcode.com/problems/number-of-1-bits

fun main() {
}

fun hammingWeight(n: Int): Int {
    return Integer.toBinaryString(n).count { it == '1' }
}