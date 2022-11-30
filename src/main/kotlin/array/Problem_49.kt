package array// https://leetcode.com/problems/group-anagrams/

fun main() {
    /*
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    Input: strs = [""]
    Output: [[""]]

    Input: strs = ["a"]
    Output: [["a"]]
     */

    println(groupAnagrams(arrayOf("eat", "tan", "tea", "ate", "nat", "bat")))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    return strs.groupBy { it.toCharArray().sorted() }.map { it.value }
}