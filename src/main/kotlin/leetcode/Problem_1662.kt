package leetcode

import util.print

fun main() {
    "1662. Check If Two String Arrays are Equivalent" print {
        println(
            arrayStringsAreEqual(
                word1 = arrayOf("ab", "c"),
                word2 = arrayOf("a", "bc"),
            )
        )
        println(
            arrayStringsAreEqual(
                word1 = arrayOf("a", "cb"),
                word2 = arrayOf("ab", "c"),
            )
        )
        println(
            arrayStringsAreEqual(
                word1 = arrayOf("abc", "d", "defg"),
                word2 = arrayOf("abcddefg"),
            )
        )
    }
}

fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    return word1.joinToString("") == word2.joinToString("")
}
