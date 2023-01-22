package leetcode_problems

import utils.print

fun main() {
    "Longest Common Prefix solution 1" print {
        println(solution1(arrayOf("flower", "flow", "flight")))
        println(solution1(arrayOf("dog", "racecar", "car")))
    }

    "Longest Common Prefix solution 2" print {
        println(solution2(arrayOf("flower", "flow", "flight")))
        println(solution2(arrayOf("dog", "racecar", "car")))
    }
}

private fun solution1(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var prefix = strs[0]
    for (i in 1 until strs.size) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}

private fun solution2(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    for (i in 0 until strs[0].length) {
        val prefix = strs[0][i]
        for (j in 1..strs.lastIndex) {
            if (i == strs[j].length || strs[j][i] != prefix) {
                return strs[j].substring(0, i)
            }
        }
    }
    return strs[0]
}