package leetcode

import util.print

fun main() {
    "125. Valid Palindrome" print {
        println(isPalindrome("A man, a plan, a canal: Panama"))
        println(isPalindrome("race a car"))
        println(isPalindrome(" "))
    }
}

// Space: O(1), Time: O(n)
fun isPalindrome(s: String): Boolean {
    var leftIdx = 0
    var rightIdx = s.lastIndex

    while (leftIdx < rightIdx) {
        while (leftIdx < rightIdx && !s[leftIdx].isLetterOrDigit()) {
            leftIdx++
        }

        while (leftIdx < rightIdx && !s[rightIdx].isLetterOrDigit()) {
            rightIdx++
        }

        if (s[leftIdx].lowercaseChar() != s[rightIdx].lowercaseChar()) {
            return false
        }

        leftIdx++
        rightIdx--
    }

    return true
}

// Space: O(n), Time: O(n)
fun isPalindrome2(s: String): Boolean {
    return s.filter { it.isLetterOrDigit() }.run { equals(reversed(), true) }
}

// Space: O(n), Time: O(n)
fun isPalindrome3(s: String): Boolean {
    val alphanumeric = StringBuilder()

    s.forEach {
        if (it.isLetterOrDigit()) {
            alphanumeric.append(it.lowercase())
        }
    }

    for (i in 0..<(alphanumeric.length / 2)) {
        if (alphanumeric[i] != alphanumeric[alphanumeric.lastIndex - i]) return false
    }

    return true
}