package leetcode

import util.print

fun main() {
    "387. First Unique Character in a String" print {
        println(firstUniqChar("leetcode"))
        println(firstUniqChar("loveleetcode"))
        println(firstUniqChar("aabb"))
    }
}

fun firstUniqChar(s: String): Int {
    val data = hashMapOf<Char, Int>()

    for (i in s.indices) {
        val char = s[i]

        if (data.containsKey(char)) {
            data[char] = data[char]!! + 1
        } else {
            data[char] = 1
        }
    }

    for (i in s.indices) {
        val char = s[i]

        if (data[char] == 1) return i
    }

    return -1
}