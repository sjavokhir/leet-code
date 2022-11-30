package hash_table

// https://leetcode.com/problems/valid-anagram/
fun main() {
    /*
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    Input: strs = [""]
    Output: [[""]]

    Input: strs = ["a"]
    Output: [["a"]]
     */

    println(isAnagram("rano", "anor"))
}

fun isAnagram(word1: String, word2: String): Boolean {
    val counter1 = buildCounter(word1)
    val counter2 = buildCounter(word2)
    return counter1 == counter2
}

private fun buildCounter(word: String): HashMap<Char, Int> {
    val counter = hashMapOf<Char, Int>()
    word.forEach {
        if (counter.containsKey(it)) {
            counter[it] = counter[it]!! + 1
        } else {
            counter[it] = 1
        }
    }
    return counter
}