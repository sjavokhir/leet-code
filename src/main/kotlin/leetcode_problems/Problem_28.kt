package leetcode_problems

import utils.print

fun main() {
    "Find the Index of the First Occurrence in a String" print {
        println(solution1("sadbutsad", "sad"))
        println(solution1("leetcode", "leeto"))
        println(solution1("leetcode", "code"))
        println(solution1("aaa", "aaaa"))
        println(solution1("mississippi", "issip"))
    }
}

private fun solution1(haystack: String, needle: String): Int {
    if (haystack.length < needle.length) return -1
    for (i in 0..haystack.length - needle.length) {
        if (haystack.substring(i, i + needle.length) == needle) return i
    }
    return -1
}

