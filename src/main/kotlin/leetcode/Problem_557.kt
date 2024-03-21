package leetcode

import util.print

/*
    Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

    Input: s = "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"

    Input: s = "God Ding"
    Output: "doG gniD"

    Solution:

    - First, we split the input string s into an array of words using the split function
      and a space " " as the delimiter.
    - Then, we create a mutable list reversedWords to store the reversed words.
    - Next, we use a for loop to iterate through the words in the words array, and for each word,
      we reverse its order of characters using the reversed function and add the reversed word to the
      reversedWords list.
    - Finally, we use the joinToString function to concatenate the elements in the reversedWords
      list into a single string, using a space " " as the separator.
 */

fun main() {
    "557. Reverse Words in a String III solution" print {
        println(solution("Let's take LeetCode contest"))
        println(solution("God Ding"))
    }
}

private fun solution(s: String): String {
    return s.split(" ").joinToString(" ") { it.reversed() }
}