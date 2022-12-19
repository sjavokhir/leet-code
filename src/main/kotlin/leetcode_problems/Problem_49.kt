package leetcode_problems

fun main() {
    println(groupAnagrams(arrayOf("eat", "tan", "tea", "ate", "nat", "bat")))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    return strs.groupBy { it.toCharArray().sorted() }.map { it.value }
}