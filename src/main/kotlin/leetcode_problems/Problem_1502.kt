package leetcode_problems

fun main() {
    println(canMakeArithmeticProgression(intArrayOf(3, 5, 1)))
}

fun canMakeArithmeticProgression(arr: IntArray): Boolean {
    arr.sort()

    val diff = arr[1] - arr[0]

    for (i in 1 until arr.size) {
        if (arr[i] - arr[i - 1] != diff) return false
    }

    return true
}