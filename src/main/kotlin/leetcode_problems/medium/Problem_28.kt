package leetcode_problems.medium

import utils.print

fun main() {
    "Find the Index of the First Occurrence in a String solution" print {
        println(solution("sadbutsad", "sad"))
        println(solution("leetcode", "leeto"))
        println(solution("leetcode", "code"))
        println(solution("aaa", "aaaa"))
        println(solution("mississippi", "issip"))
    }
}

private fun solution(haystack: String, needle: String): Int {
    if (haystack.length < needle.length) return -1
    for (i in 0..haystack.length - needle.length) {
        if (haystack.substring(i, i + needle.length) == needle) return i
    }
    return -1
}

