package leetcode_problems

import utils.print


fun main() {
    "Reverse Words in a String solution 1" print {
        println(solution1("the sky is blue"))
        println(solution1("  hello world  "))
        println(solution1("a good   example"))
    }

    "Reverse Words in a String solution 2" print {
        println(solution2("the sky is blue"))
        println(solution2("  hello world  "))
        println(solution2("a good   example"))
    }
}

private fun solution2(s: String): String {
    val builder = StringBuilder()
    val words = s.trim().split(" ")
    for (i in words.lastIndex downTo 0) {
        if (words[i].isNotEmpty()) {
            builder.append(words[i]).append(" ")
        }
    }
    builder.setLength(builder.length - 1)
    return builder.toString()
}

private fun solution1(s: String): String {
    val words = ArrayList<String>()
    var word = ""
    var last: Char? = null
    s.forEach {
        if (it == ' ' && (last == null || last == ' ')) return@forEach
        if (it == ' ') {
            words.add(word)
            word = ""
        } else {
            word += it
        }
        last = it
    }
    if (word.isNotEmpty()) words.add(word)
    words.reverse()
    return words.joinToString(" ")
}