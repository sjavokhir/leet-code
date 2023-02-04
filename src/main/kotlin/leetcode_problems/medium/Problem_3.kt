package leetcode_problems.medium

import utils.print

fun main() {
    "Longest Substring Without Repeating Characters solution" print {
        println(solution("abcabcbb"))
        println(solution("bbbbb"))
        println(solution("pwwkew"))
    }
}

private fun solution(s: String): Int {
    val results = hashMapOf<Char, Char>()
    var count = 0
    s.forEach {
        if (results.containsKey(it)) {
            if (results.size > count) {
                count = results.size
            }
            results.clear()
        }
        results[it] = it
    }
    return count
}