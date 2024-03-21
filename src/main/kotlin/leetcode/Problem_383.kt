package leetcode

import util.print

fun main() {
    "383. Ransom Note solution 1" print {
        println(solution1("a", "b"))
        println(solution1("aa", "ab"))
        println(solution1("aa", "aab"))
        println(solution1("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"))
    }

    "383. Ransom Note solution 2" print {
        println(solution2("a", "b"))
        println(solution2("aa", "ab"))
        println(solution2("aa", "aab"))
        println(solution2("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"))
    }
}

private fun solution1(ransomNote: String, magazine: String): Boolean {
    val mcnt = IntArray(26)
    for (i in magazine.indices) {
        mcnt[magazine[i] - 'a']++
    }
    for (i in ransomNote.indices) {
        if (mcnt[ransomNote[i] - 'a'] <= 0) return false
        mcnt[ransomNote[i] - 'a']--
    }
    return true
}

private fun solution2(ransomNote: String, magazine: String): Boolean {
    if (ransomNote.length <= 1) return magazine.contains(ransomNote)
    val map = HashMap<Char, Int>()
    var size = 0
    magazine.forEach {
        if (map.containsKey(it)) {
            map[it] = map[it]!! + 1
        } else {
            map[it] = 1
        }
    }
    ransomNote.forEach {
        if (map.containsKey(it) && map[it]!! > 0) {
            map[it] = map[it]!! - 1
            size += 1
        }
    }
    return size == ransomNote.length
}