package leetcode_problems

fun main() {
    println(function("111"))
    println(function("60609"))
    println(function("001"))
    println(function("010"))
    println(function("1001"))
    println(function("8118"))
    println(function("8109"))
    println(function("99999999766666666"))
}
fun function(s: String): Boolean {
    var left = 0
    var right = s.length - 1

    val map = hashMapOf('0' to '0', '8' to '8', '6' to '9', '9' to '6', '1' to '1')

    while (left <= right) {
        if (s[left] !in map || map[s[left]] != s[right]) {
            return false
        }
        left += 1
        right -= 1
    }
    return true
}

fun function2(s: String): Boolean {
    for (i in 0..s.length / 2) {
        if (!isValid(s, i)) return false
    }
    return true
}

fun isValid(s: String, index: Int): Boolean {
    val first = s[index]
    val second = s[s.lastIndex - index]

    if (s.length % 2 != 0) {
        val center = s[s.length / 2]
        if (!(center == '0' || center == '1' || center == '8')) return false
    }

    if (first == second) return true
    if (first == '6' && second == '9') return true
    if (first == '9' && second == '6') return true

    return false
}