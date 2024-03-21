package leetcode

import util.print

fun main() {
    "70. Climbing Stairs solution 1" print {
        println(solution1(0, 1))
        println(solution1(0, 2))
        println(solution1(0, 3))
        println(solution1(0, 4))
        println(solution1(0, 5))
    }

    "70. Climbing Stairs solution 2" print {
        println(solution2(1))
        println(solution2(2))
        println(solution2(3))
        println(solution2(4))
        println(solution2(5))
    }
}

private fun solution1(i: Int, n: Int): Int {
//    Bruce force aproach using recursion
//    Time: O(2^n), Space: O(n)

    if (i > n) return 0
    if (i == n) return 1
    return solution1(i + 1, n) + solution1(i + 2, n)
}

private fun solution2(n: Int): Int {
//    Using the idea of Fibonacci sequence
//    Time: O(n), Space: O(1)

    if (n == 0 || n == 1)
        return n

    var firstFib = 1
    var secondFib = 2

    for (i in 3..n) {
        val nextFib = firstFib + secondFib
        firstFib = secondFib
        secondFib = nextFib
    }

    return secondFib
}