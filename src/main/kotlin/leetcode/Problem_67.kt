package leetcode

import util.print

fun main() {
    "67. Add Binary solution" print {
        println(solution("11", "1"))
        println(solution("1010", "1011"))
    }
}

private fun solution(a: String, b: String): String {
    var i = a.lastIndex
    var j = b.lastIndex
    var carry = 0
    val sb = StringBuilder()
    while (i >= 0 || j >= 0) {
        var sum = carry
        if (i >= 0) {
            sum += a[i--] - '0'
        }
        if (j >= 0) {
            sum += b[j--] - '0'
        }
        sb.append(sum % 2)
        carry = sum / 2
    }
    if (carry != 0) sb.append(carry)
    return sb.reverse().toString()
}