package leetcode_problems

fun main() {
    println(plusOne(intArrayOf(1, 2, 3)).toList())
    println(plusOne(intArrayOf(4, 3, 2, 1)).toList())
    println(plusOne(intArrayOf(4, 9, 9, 9)).toList())
    println(plusOne(intArrayOf(9)).toList())
    println(plusOne(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)).toList())
}

fun plusOne(digits: IntArray): IntArray {
    var lastNineIndex = digits.lastIndex

    while (lastNineIndex >= 0 && digits[lastNineIndex] == 9) {
        lastNineIndex--
    }

    if (lastNineIndex == -1) {
        val results = IntArray(digits.size + 1)
        results[0] = 1
        return results
    }

    val results = IntArray(digits.size)
    results[lastNineIndex] = digits[lastNineIndex] + 1

    for (i in 0 until lastNineIndex) {
        results[i] = digits[i]
    }

    return results
}