package leetcode_problems

fun main() {
    println(validMountainArray(intArrayOf(3, 5, 5)))
    println(validMountainArray(intArrayOf(0, 3, 2, 1)))
    println(validMountainArray(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)))
}

fun validMountainArray(arr: IntArray): Boolean {
    if (arr.size < 3) return false
    if (arr[0] >= arr[1]) return false

    var current = arr[1]
    var isTop = true

    for (i in 2..arr.lastIndex) {
        if (arr[i] == current) return false
        if (!isTop && arr[i] > current) return false
        if (isTop && arr[i] < current) isTop = false

        current = arr[i]
    }

    return !isTop
}