package leetcode

import util.print

fun main() {
    "2942. Find Words Containing Character" print {
        println(findWordsContaining(arrayOf("leet", "code"), 'e'))
        println(findWordsContaining(arrayOf("abc", "bcd", "aaaa", "cbc"), 'a'))
        println(findWordsContaining(arrayOf("abc", "bcd", "aaaa", "cbc"), 'z'))
    }
}

fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
    val indices = mutableListOf<Int>()

    words.forEachIndexed { index, word ->
        if (word.contains(x)) {
            indices.add(index)
        }
    }

    return indices
}