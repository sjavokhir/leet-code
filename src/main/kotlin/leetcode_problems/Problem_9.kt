package leetcode_problems

import utils.print

fun main() {
    "Palindrome Number solution 1" print {
        println(solution1(121))
        println(solution1(-121))
        println(solution1(10))
        println(solution1(1001))
    }
}

private fun solution1(x: Int): Boolean {
    when {
        x < 0 -> return false
        x == 0 -> return true
        x % 10 == 0 -> return false
    }
    var reversed = 0
    var mutx = x
    while (mutx > reversed) {
        val digit = mutx % 10
        reversed *= 10
        reversed += digit
        mutx /= 10
    }
    return mutx == reversed || mutx == reversed / 10
}

private fun solution2(x: Int): Boolean {
    if (x < 0) return false
    var d1 = 1
    var d2 = 1
    var result = 0
    while (x / d1 >= 10) {
        d1 *= 10
    }
    while (d1 > 0) {
        result += ((x / d1) % 10) * d2
        d1 /= 10
        d2 *= 10
    }
    return result == x
}