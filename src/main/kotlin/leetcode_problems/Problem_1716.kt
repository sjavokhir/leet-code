package leetcode_problems

import utils.print

fun main() {
    "Calculate Money in Leetcode Bank solution" print {
        println(solution(4))
        println(solution(10))
        println(solution(20))
        println(solution(26))
    }
}

private fun solution(n: Int): Int {
    val weeks = n / 7
    val extra = n % 7
    return weeks * 28 + 7 * weeks * (weeks - 1) / 2 + extra * (extra + 1) / 2 + weeks * extra
}