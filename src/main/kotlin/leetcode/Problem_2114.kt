package leetcode

import util.print

fun main() {
    "2114. Maximum Number of Words Found in Sentences" print {
        println(
            mostWordsFound(
                arrayOf(
                    "alice and bob love leetcode",
                    "i think so too",
                    "this is great thanks very much"
                )
            )
        )
        println(
            mostWordsFound(
                arrayOf(
                    "please wait",
                    "continue to fight",
                    "continue to win"
                )
            )
        )
    }
}

fun mostWordsFound(sentences: Array<String>): Int {
    var max = 0

    for (i in sentences.indices) {
        val count = sentences[i].split(" ").size
        if (max < count) {
            max = count
        }
    }

    return max
}