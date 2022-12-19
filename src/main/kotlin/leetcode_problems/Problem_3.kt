package leetcode_problems

fun main() {
    println(lengthOfLongestSubstring("abdba12"))
}

fun lengthOfLongestSubstring(s: String): Int {
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