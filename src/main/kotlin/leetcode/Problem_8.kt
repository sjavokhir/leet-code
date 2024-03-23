package leetcode

import util.print

fun main() {
    "8. String to Integer (atoi)" print {
        println(myAtoi("42"))
        println(myAtoi("-42"))
        println(myAtoi("    -42"))
        println(myAtoi("4193 with words"))
        println(myAtoi("words and 987"))
        println(myAtoi("-91283472332"))
    }
}

fun myAtoi(s: String): Int {
    if (s[0].isLetter()) return 0

    var num = 0
    var isNegative = false

    for (i in s.indices) {
        val char = s[i]

        if (char == '-' && i != s.lastIndex && s[i + 1].isDigit()) {
            isNegative = true
            break
        }
    }

    for (i in s.indices) {
        val char = s[i]

        if (char.isDigit()) {
            num *= 10
            num += (char - '0')
        }
    }

    if (isNegative) {
        num = -num
    }

    return num
}