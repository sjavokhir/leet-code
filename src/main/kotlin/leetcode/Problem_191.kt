package leetcode

import util.print

fun main() {
    "191. Number of 1 Bits solution" print {
        println(solution(1))
        println(solution(2))
    }
}

private fun solution(n: Int): Int {
    return Integer.toBinaryString(n).count { it == '1' }
}