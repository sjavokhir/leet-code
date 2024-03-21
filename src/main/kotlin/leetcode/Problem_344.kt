package leetcode

/*
    Solution: Mid-pointer of the array is found.
    The elements on the left and right sides of the mid-point are replaced.
 */

fun main() {
    reverseString(charArrayOf('h', 'e', 'l', 'l', '0'))
}

fun reverseString(s: CharArray) {
    val midPoint = s.size / 2

    for (index in 0 until midPoint) {
        val temp = s[index]
        s[index] = s[s.lastIndex - index]
        s[s.lastIndex - index] = temp
    }
}

//fun reverseString(s: CharArray) {
//    s.reverse()
//}