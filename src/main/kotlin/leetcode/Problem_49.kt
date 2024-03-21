package leetcode

import util.print

fun main() {
    "49. Group Anagrams solution" print {
        println(solution(arrayOf("eat", "tan", "tea", "ate", "nat", "bat")))
    }
}

private fun solution(strs: Array<String>): List<List<String>> {
    return strs.groupBy { it.toCharArray().sorted() }.map { it.value }
}